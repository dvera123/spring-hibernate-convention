package com.project.maniac.service;

import java.util.List;

import com.project.maniac.model.ManiacUser;

public interface ManiacUserService {
	public void add(ManiacUser maniacUser);
	public void edit(ManiacUser maniacUser);
	public void delete(int maniacUserId);
	public ManiacUser getManiacUser(int maniacUserId);
	public List getAllManiacUser();

}