package com.example.user;

import java.util.*;

import com.example.user.User;

public interface UserRepository {

    ArrayList<User> getUsers();

    User getUserById(int userId);

    User addUser(User user);

    User updateUser(int userId, User user);

    void deleteUser(int userId);
}