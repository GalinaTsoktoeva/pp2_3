package web.dao;

import web.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class UserDaoImp implements UserDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Transactional
    @Override
    public User updateUser(User user) {
        if (user.getId() == null) {
            entityManager.persist(user);
            return user;
        } else {
            return entityManager.merge(user);
        }
    }
    @Transactional
    @Override
    public User getUserById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        User userFind = entityManager.find(User.class, id);
        entityManager.remove(userFind);
    }
}
