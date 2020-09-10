package internetShop.service;

import internetShop.entity.User;
import internetShop.entity.product.Product;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> getUser(Long id);

    User getUser(String name);

    List<User> getUsers();

    boolean saveUser(User user);

    void deleteUser(Long id);

    List<Product> loadBucket(String username);


}
