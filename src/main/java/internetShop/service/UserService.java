package internetShop.service;

import internetShop.entity.User;
import internetShop.entity.product.Product;

import java.util.List;

public interface UserService {
    User getUser(Long id);

    User getUser(String name);

    List<User> getUsers();

    void saveUser(User user);

    void deleteUser(Long id);
}
