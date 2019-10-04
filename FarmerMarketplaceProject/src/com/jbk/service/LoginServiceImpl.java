package com.jbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jbk.dao.LoginDao;
import com.jbk.model.Login;


@Service
@Transactional
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDao logindao;
	
	public void setStudentdao(LoginDao logindao) {
		this.logindao = logindao;
	}

	
	@Override
	public boolean checkuserValidation(String username, String password) {
	return	logindao.checkuserValidation(username, password);
	
	}

	

	@Override
	public Login get(String username) {
	return logindao.get(username);
	}

}
