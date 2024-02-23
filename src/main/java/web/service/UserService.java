package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUser();

    User updateUser(User user);

    User getUserById(Long id);
    void deleteUser(Long id);
}
