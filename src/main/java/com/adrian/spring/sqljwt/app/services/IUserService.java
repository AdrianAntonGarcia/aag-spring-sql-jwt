package com.adrian.spring.sqljwt.app.services;

import java.util.List;

import com.adrian.spring.sqljwt.app.models.entity.auth.User;

public interface IUserService {
	public List<User> getUsers();

	public User getUser(Long id);

	public void createUser(User user);

	public void deleteUser(Long id);
}
