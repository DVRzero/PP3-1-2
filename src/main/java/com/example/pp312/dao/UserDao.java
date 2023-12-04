package com.example.pp312.dao;

import com.example.pp312.model.User;
import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void addUser(User user);

    User getUserById(Long id);

    void updateUser(User user);

    void deleteUser(Long id);
}
