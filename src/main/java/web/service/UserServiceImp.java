package web.service;

import web.dao.UserDao;
import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void add(User user) { userDao.add(user);
    }

    @Override
    public List<User> listUser() {
        return userDao.listUsers();
    }

    @Override
    public User updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public User getUserById(Long id) { return userDao.getUserById(id); }

    @Override
    public void deleteUser(Long id) { userDao.deleteUser(id);

    }
}
