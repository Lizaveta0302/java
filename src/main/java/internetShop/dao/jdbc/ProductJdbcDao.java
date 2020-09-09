package internetShop.dao.jdbc;

import internetShop.dao.ProductDao;
import internetShop.entity.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.util.List;

@Repository
public class ProductJdbcDao implements ProductDao {

    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    @Autowired
    public void setDataSource(@Qualifier("dataSource") DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private RowMapper<Product> productRowMapper = (resultSet, i) ->
            (Product) new Product()
                    .setName(resultSet.getString("name"))
                    .setPrice(resultSet.getDouble("price"))
                    .setId(resultSet.getLong("id_product"));

    @Override
    public void create(Product product) {
        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT into product(name, price) VALUES (?,?)");
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            return preparedStatement;
        });
    }

    @Override
    public Product read(Long id) {
        return jdbcTemplate.queryForObject("select * from product where id_product = ?", productRowMapper, id);
    }

    @Override
    public void update(Product product) {
        jdbcTemplate.update("UPDATE product set name = ?, price = ? where id_product = ?",
                product.getName(), product.getPrice(), product.getId());
    }

    @Override
    public void delete(Long id) {
        jdbcTemplate.update("delete from product where id_product = ?", id);
    }

    @Override
    public List<Product> findAll() {
        return jdbcTemplate.query("select * from product", productRowMapper);
    }

    @Override
    public Product findByName(String name) {
        return jdbcTemplate.queryForObject("select * from product where name = ? ", productRowMapper, name);
    }
}
