package internetShop.dao.jdbc;

import internetShop.dao.ProductDao;
import internetShop.entity.product.Product;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.PreparedStatement;
import java.util.List;

public class ProductJdbcDao extends JdbcDaoSupport implements ProductDao {
    private RowMapper<Product> productRowMapper = (resultSet, i) ->
            (Product) new Product()
                    .setName(resultSet.getString("name"))
                    .setPrice(resultSet.getDouble("price"))
                    .setId(resultSet.getLong("id_product"));

    @Override
    public void create(Product product) {
        getJdbcTemplate().update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT into product(name, price) VALUES (?,?)");
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            return preparedStatement;
        });
    }

    @Override
    public Product read(Long id) {
        return getJdbcTemplate().queryForObject("select * from product where id_product = ?", productRowMapper, id);
    }

    @Override
    public void update(Product product) {
        getJdbcTemplate().update("UPDATE product set name = ?, price = ? where id_product = ?",
                product.getName(), product.getPrice(), product.getId());
    }

    @Override
    public void delete(Long id) {
        getJdbcTemplate().update("delete from product where id_product = ?", id);
    }

    @Override
    public List<Product> findAll() {
        return getJdbcTemplate().query("select * from product", productRowMapper);
    }

    @Override
    public Product findByName(String name) {
        return getJdbcTemplate().queryForObject("select * from product where name = ? ", productRowMapper, name);
    }
}
