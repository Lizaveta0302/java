package internetShop.service;

import internetShop.entity.Role;
import internetShop.entity.User;
import internetShop.entity.product.Product;
import internetShop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserDetailsService, UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PersistenceContext
    private EntityManager em;

    @Transactional
    @Override
    public List<Product> loadBucket(String username) {

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Product> productCriteria = cb.createQuery(Product.class);
        Root<Product> productRoot = productCriteria.from(Product.class);

        CriteriaQuery<Product> selectProduct = productCriteria.select(productRoot)
                .where(cb.in(productRoot.get("bucket")).value(userRepository.findByUsername(username).getBucket().getId()));

        selectProduct.orderBy(cb.asc(productRoot.get("name")));
        TypedQuery<Product> typedQuery = em.createQuery(selectProduct);

        return typedQuery.getResultList();
    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(name);
        if (Objects.isNull(user)) {
            throw new UsernameNotFoundException("User is not found");
        }
        return user;
    }

    @Override
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User getUser(String name) {
        return userRepository.findByUsername(name);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Transactional
    public boolean saveUser(User user) {
        User foundUser = userRepository.findByUsername(user.getUsername());
        if (!Objects.isNull(foundUser)) {
            return false;
        }
        user.setName(user.getName());
        user.setUsername(user.getUsername());
        user.setRoles(Collections.singletonList(new Role(1L, "ROLE_USER")));
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return true;
    }

    public void deleteUser(Long id) {
        if (userRepository.findById(id).isPresent()) {
            userRepository.deleteById(id);
        }
    }
}
