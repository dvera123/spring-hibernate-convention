package com.project.maniac;

import java.util.List;

import com.project.maniac.dao.impl.ManiacUserDaoImpl;
import com.project.maniac.model.ManiacUser;

public class TestManiacUser {
	
	private ManiacUserDaoImpl maniacUserDaoImpl = new ManiacUserDaoImpl();
	

	@org.junit.Test
	public void test() {
		
		
	}
	@org.junit.Test
	public void getInventory() {
		
        List l = maniacUserDaoImpl.getAllManiacUser();
        System.out.println("============================================Inventory.findAll=============================================");
        for(Object item: l){
        	ManiacUser maniacUser = (ManiacUser) item;
        	System.out.println(maniacUser.getManiacUserName());
        }
	}

}
