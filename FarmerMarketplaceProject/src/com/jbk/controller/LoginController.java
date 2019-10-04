package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.jbk.model.Login;

import com.jbk.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginservice;
		
	public void setUserService(LoginService loginservice) {
		this.loginservice=loginservice;
	}
	
	
       @RequestMapping (value="/userlogin.html",method=RequestMethod.GET)
	 	public ModelAndView gotOUserLogin(@ModelAttribute("login") Login login)
	 	{
	 		return new ModelAndView("userlogin");
	 	}
	     
	     @RequestMapping (value="/userloginchecking.html",method=RequestMethod.GET)
	 	public ModelAndView gotoLoginpage(@ModelAttribute ("login") Login login,BindingResult result,ModelMap model1)
	 	{
	 		
	 	
	 	 Login userinfofromdb=loginservice.get(login.getUsername());
	 	 String usertype=userinfofromdb.getUsertype();
	 	
	   boolean userexist=loginservice.checkuserValidation(login.getUsername(),login.getPassword());
	 
	 		if((userexist)&&(usertype.equals("farmer")))
	 			{
	 		return new ModelAndView("farmerpage");
	 	         }
	 
	     	else if((userexist)&&(usertype.equals("trader")))
	 	     {
	 		return new ModelAndView("traderpage");
	 		
	      	}
	 		
	     	else if((userexist)&&(usertype.equals("admin")))
	 	     {
	 		return new ModelAndView("adminpage");
	 		
	      	}
	   	return new ModelAndView("userlogin");
	 	}
	     
	    
	     
	     
	     
	    
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	 }
	     
	     
	     
	     
	     
	     
	     
	
	
	
	
	 