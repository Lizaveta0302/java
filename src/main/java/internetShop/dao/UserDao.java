package internetShop.dao;

import internetShop.entity.User;

import java.util.List;

public interface UserDao extends CrudDao<Long, User> {
    User findByName(String name);

    List<User> findAll();
}
