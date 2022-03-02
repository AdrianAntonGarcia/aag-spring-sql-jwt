package com.adrian.spring.sqljwt.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adrian.spring.sqljwt.app.models.dao.IUserDao;
import com.adrian.spring.sqljwt.app.models.entity.auth.User;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	@Transactional(readOnly = true)
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return (List<User>) userDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public User getUser(Long id) {
		return userDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void createUser(User user) {
		userDao.save(user);
	}

	@Override
	@Transactional
	public void deleteUser(Long id) {
		userDao.deleteById(id);
	}

}
