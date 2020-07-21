package com.rameshit.dao.impl;

import javax.sql.DataSource;

import com.rameshit.dao.LoginDAO;

public class LoginDAOImpl implements LoginDAO {
	

	@Override
	public void getLoginDetailsFromDB() {
		//really we are connecting database
		//write jdbc code to connect the database
		System.out.println("getLoginDetailsFromDB");
	}
}
