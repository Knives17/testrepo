package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.User;

@Mapper
public interface UserMapper {
	
	
	@Select("SELECT * FROM users")
	List<User> getAllUsers();

	@Select("SELECT * FROM users where user_id= #{user_id}")
	User getUserById(int user_id);
	
	@Insert("INSERT INTO users(first_name,last_name,email_address) VALUES (#{first_name},#{last_name},#{email_address})")
	@Options(useGeneratedKeys = true, keyProperty = "user_id")
	void insertUser(User user);
	
	@Update("UPDATE users SET first_name=#{first_name}, last_name=#{last_name}, email_address=#{email_address} WHERE user_id=#{user_id}")
	void updateUser(User user);
	
	@Delete("DELETE FROM users where user_id=#{user_id}")
	void deleteUser(int user_id);
}
