package com.restful.ws.domain;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String profession;
	
	
	public User(){}
	
	public User(int pId, String pName, String pProfession){
		this.id=pId;
		this.name = pName;
		this.profession = pProfession;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	
	

}
