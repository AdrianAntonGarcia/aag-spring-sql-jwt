package com.adrian.spring.sqljwt.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adrian.spring.sqljwt.app.models.entity.auth.User;
import com.adrian.spring.sqljwt.app.services.IUserService;

@RestController
@RequestMapping("/api/auth/users")
public class UserRestController {

	@Autowired
	private IUserService userService;
	
	@GetMapping
	public List<User> getUsers(){
		return userService.getUsers();
	}
}
