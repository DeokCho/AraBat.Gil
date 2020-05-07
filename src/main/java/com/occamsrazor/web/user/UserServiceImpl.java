package com.occamsrazor.web.user;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	@Autowired UserDao userDao;
	
	private String joinDate() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}
	
	@Override
	public void register(User user) {
		user.setRegisterDate(joinDate());
		userDao.insert(user);
	}
	
	@Override
	public List<User> findAll() {
		return userDao.selectAll();
	}

	@Override
	public User findOne(String userid) {
		return userDao.selectOne(userid);
	}

	@Override
	public void modify(User user) {
		userDao.update(user);
	}

	@Override
	public void remove(User user) {
		userDao.delete(user);
	}

	
}