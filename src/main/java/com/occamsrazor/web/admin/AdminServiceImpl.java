package com.occamsrazor.web.admin;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired AdminDao adminDao;
	
	
	@Override
	public void register(Admin admin) {
		admin.setEmployNumber(createEmployNumber());
		admin.setPasswd("1");
		admin.setRegisterDate(createCurrentDate());
		adminDao.insert(admin);
	}

	private String createCurrentDate() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}

	private String createEmployNumber() {
		String startNum = "";
		for(int i=0;i < 4;i++) {
			startNum += String.valueOf((int)(Math.random()*10));
		}
		return startNum;
	}

	@Override
	public List<Admin> findAll() {
		return adminDao.selectAll();
	}

	@Override
	public Admin findOne(String employNumber) {
		return adminDao.selectOne(employNumber);
	}

	@Override
	public void modify(Admin admin) {
		adminDao.update(admin);
		
	}

	@Override
	public void remove(Admin admin) {
		adminDao.delete(admin);
		
	}
	
	
}