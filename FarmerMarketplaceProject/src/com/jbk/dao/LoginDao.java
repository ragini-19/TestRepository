package com.jbk.dao;


import com.jbk.model.Login;

public interface LoginDao {
	
	public boolean checkuserValidation(String username,String password);
	
	
	public Login get(String username);

	
}
