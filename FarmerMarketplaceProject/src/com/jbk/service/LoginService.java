package com.jbk.service;

import com.jbk.model.Login;


public interface LoginService {
	
	public boolean checkuserValidation(String username,String password);
	
	public Login get(String username);
	
}
