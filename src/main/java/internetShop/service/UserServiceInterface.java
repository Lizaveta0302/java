package internetShop.service;

import internetShop.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {
    Optional<User> getUser(Long id);

    User getUser(String name);

    List<User> getUsers();

    boolean saveUser(User user);

    void deleteUser(Long id);
}
