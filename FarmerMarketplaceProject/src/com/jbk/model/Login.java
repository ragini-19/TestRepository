 package com.jbk.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="logintable")
@SuppressWarnings("serial")
public class Login implements Serializable {
	@Id
	@GeneratedValue
	private int uid;
    private String username;
    private String password;
    private String usertype;
	   
	  public Login()
	  {
		  
	  }
	   
	   public String getUsertype() {
		return usertype;
	   }
	   public void setUsertype(String usertype) {
		this.usertype = usertype;
	   }
	 
	  
	   public int getUid() {
		return uid;
	    }
	   public void setUid(int uid) {
		this.uid = uid;
	   }
	   public String getUsername() {
	      return username;
	   }
	   public void setUsername(String username) {
	      this.username = username;
	   }

	   public String getPassword() {
	      return password;
	   }
	   public void setPassword(String password) {
	      this.password = password;
	   }
	  
	  
	}