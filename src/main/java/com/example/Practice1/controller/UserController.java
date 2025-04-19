package com.example.Practice1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Practice1.dto.UserProfileDto;
import com.example.Practice1.dto.UserRegistrationDto;
import com.example.Practice1.serviceInterface.UserServiceInterface;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserServiceInterface userServiceInterface;
    
	@PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserRegistrationDto userRegistrationDto){
		userServiceInterface.registerUser(userRegistrationDto);
		return ResponseEntity.ok("User registered successfully");
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserProfileDto> getUserById(@PathVariable Long id){
		UserProfileDto userProfileDto = userServiceInterface.getUserById(id);
		return ResponseEntity.ok(userProfileDto);
	}
}



