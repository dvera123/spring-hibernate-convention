package com.project.maniac.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.maniac.dao.ManiacUserDao;
import com.project.maniac.model.ManiacUser;
import com.project.maniac.service.ManiacUserService;



@Service
public class ManiacUserServiceImpl implements ManiacUserService{
	
	@Autowired
	private ManiacUserDao maniacUserDao;
	
	public ManiacUserServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Transactional
	public void add(ManiacUser maniacUser) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void edit(ManiacUser maniacUser) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void delete(int maniacUserId) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public ManiacUser getManiacUser(int maniacUserId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List getAllManiacUser() {
		return maniacUserDao.getAllManiacUser();
	}

}
