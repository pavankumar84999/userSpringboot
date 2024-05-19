package com.example.user;

import org.springframework.web.server.ResponseStatusException;

import org.springframework.http.HttpStatus;

import com.example.user.User;
import com.example.user.UserRepository;

import java.util.*;

public class UserService implements UserRepository {

    private static HashMap<Integer, User> team = new HashMap<>();

    public UserService() {
        team.put(1, new User(1, "pavan", "8499921469", "BESPLO217H"));
        team.put(2, new User(2, "gupta", "6303656721", "NVSPY098G"));
    }

    int uniqueId = 3;

    @Override
    public ArrayList<User> getUsers() {
        Collection<User> userCollection = team.values();
        ArrayList<User> users = new ArrayList<>(userCollection);

        return users;
    }

    @Override
    public User getUserById(int userId) {
        User user = team.get(userId);

        if (user == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return user;
    }

    @Override
    public User addUser(User user) {
        user.setUserId(uniqueId);
        team.put(uniqueId, user);

        uniqueId += 1;
        return user;
    }

    @Override
    public User updateUser(int userId, User user) {
        User existingUser = team.get(userId);

        if (existingUser == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        if (user.getFull_name() == null) {
            existingUser.setFull_name(user.getFull_name());
        }

        if (user.getMob_num() == null) {
            existingUser.setMob_num(user.getMob_num());
        }

        if (user.getPan_num() == null) {
            existingUser.setPan_num(user.getPan_num());
        }

        return existingUser;
    }

    @Override
    public void deleteUser(int userId) {

        User user = team.get(userId);

        if (user == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            team.remove(userId);
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }

    }
}
