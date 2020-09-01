package internetShop.service;

import internetShop.dao.UserDao;
import internetShop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getUser(Long id) {
        return userDao.read(id);
    }

    @Override
    public User getUser(String name) {
        return userDao.findByName(name);
    }

    @Override
    public List<User> getUsers() {
        return userDao.findAll();
    }

    @Override
    public void saveUser(User user) {
        if (Objects.isNull(user.getId())) {
            userDao.create(user);
        } else {
            userDao.update(user);
        }
    }

    @Override
    public void deleteUser(Long id) {
        userDao.delete(id);
    }
}
