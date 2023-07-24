package com.example.day1.demo.restController;

import com.example.day1.demo.domain.User;
import com.example.day1.demo.service.UserService;
import com.example.day1.demo.service.impl.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class Controller {

    private UserServiceImpl userService;

    public Controller(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/welcome")
    public static String welcome() {
        return "Hello world";
    }

    @PostMapping("/addUser")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User user1 = userService.createUser(user);
        return new ResponseEntity<User>(user1, HttpStatus.OK);
    }

    @GetMapping("/users")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        User savedsUer = userService.getUserById(id);
        return new ResponseEntity<User>(savedsUer, HttpStatus.OK);
    }
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id){
        userService.deleteUser(id);
        return  "User deleted successfully with id : "+ id;
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user , @PathVariable int id){
        User updatedUser = userService.updateUser(user,id);
        return ResponseEntity.ok(updatedUser);
    }
}
