package com.project.maniac.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.project.maniac.dao.ManiacUserDao;
import com.project.maniac.model.ManiacUser;
import com.project.maniac.util.HibernateUtil;

@Repository
public class ManiacUserDaoImpl implements ManiacUserDao{
	
	Session session = HibernateUtil.getSessionFactory().openSession();
	
	@Override
	public void add(ManiacUser maniacUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit(ManiacUser maniacUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int maniacUserId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ManiacUser getManiacUser(int maniacUserId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAllManiacUser() {
		Query qr = session.getNamedQuery("ManiacUser.findAll");
        List l = qr.list();
		return l;
	}

}
