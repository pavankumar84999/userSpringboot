package com.example.user;

import org.springframework.web.bind.annotation.*;

import java.util.*;

import com.example.user.UserService;

import com.example.user.User;

@RestController
public class UserController {

   UserService userService = new UserService();

   @GetMapping("/users")
   public ArrayList<User> getUsers() {
      return userService.getUsers();
   }

   @GetMapping("users/{userId}")
   public User getUserById(@PathVariable("userId") int userId) {
      return userService.getUserById(userId);
   }

   @PostMapping("/users")
   public User addUser(@RequestBody User user) {
      return userService.addUser(user);
   }

   @PutMapping("/users/{userId}")
   public User updateUser(@PathVariable("userId") int userId, @RequestBody User user) {
      return userService.updateUser(userId, user);
   }

   @DeleteMapping("/users/{userId}")
   public void deleteUser(@PathVariable int userId) {
      userService.deleteUser(userId);
   }
}