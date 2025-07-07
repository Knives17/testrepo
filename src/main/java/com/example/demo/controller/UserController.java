package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController{
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("{user_id}")
	public User getUserById(@PathVariable int user_id) {
		return userService.getUserById(user_id);
	}
	
	@PostMapping
	public void insertUser(@RequestBody User user) {
		userService.insertUser(user);
	}
	
	@PutMapping("/{user_id}")
	public void updateUser(@PathVariable int user_id, @RequestBody User user) {
		user.setUser_id(user_id);
		userService.updateUser(user);	
	}
	
	@DeleteMapping("/{user_id}")
	public void deleteUser(@PathVariable int user_id) {
		userService.deleteUser(user_id);
	}
	

}
