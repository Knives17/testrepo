package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;

@Service
public class UserService{
	
	@Autowired
	private UserMapper userMapper;

	public User getUserById(int user_id) {
		return userMapper.getUserById(user_id);
	}

	public List<User> getAllUsers() {
		return userMapper.getAllUsers();
	}

	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

	public void updateUser(User user) {
		userMapper.updateUser(user);	
	}

	public void deleteUser(int user_id) {
		userMapper.deleteUser(user_id);
	}
	
}
