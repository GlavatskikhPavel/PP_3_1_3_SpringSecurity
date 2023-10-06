package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;
import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> getAllUsers();
    User showUserById(int id);
    void saveUser(User user);
    void deleteUser(int id);
    void updateUser(int id, User user);
    User findByUsername(String name);
}
