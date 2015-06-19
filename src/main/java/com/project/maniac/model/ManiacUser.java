package com.project.maniac.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
    @NamedQuery(name = "ManiacUser.findAll", query = "SELECT m FROM ManiacUser m")})
public class ManiacUser {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int maniacUserId;
	
	@Column
	private String maniacUserName;
	
	@Column
	private int maniacUserAge;
	
	public ManiacUser(String maniacUserName, int maniacUserAge ) {
		this.maniacUserAge = maniacUserAge;
		this.maniacUserName = maniacUserName;
	}
	
	public ManiacUser() {
		// TODO Auto-generated constructor stub
	}
	
	public int getManiacUserId() {
		return maniacUserId;
	}
	public void setManiacUserId(int maniacUserId) {
		this.maniacUserId = maniacUserId;
	}
	public String getManiacUserName() {
		return maniacUserName;
	}
	public void setManiacUserName(String maniacUserName) {
		this.maniacUserName = maniacUserName;
	}
	public int getManiacUserAge() {
		return maniacUserAge;
	}
	public void setManiacUserAge(int maniacUserAge) {
		this.maniacUserAge = maniacUserAge;
	}

}
