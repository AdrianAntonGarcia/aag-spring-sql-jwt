package com.adrian.spring.sqljwt.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrian.spring.sqljwt.app.models.dao.IUserDao;
import com.adrian.spring.sqljwt.app.models.entity.auth.User;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return (List<User>) userDao.findAll();
	}

	@Override
	public User getUser(Long id) {
		return userDao.findById(id).orElse(null);
	}

	@Override
	public void createUser(User user) {
		userDao.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		userDao.deleteById(id);

	}

}
