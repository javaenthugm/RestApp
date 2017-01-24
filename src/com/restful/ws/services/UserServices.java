package com.restful.ws.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.restful.ws.dao.UserDao;
import com.restful.ws.domain.User;

@Path("/UserSerivces")
public class UserServices {

	UserDao userDao = new UserDao();
	
	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsers(){
		System.out.println("Inside UserServices");
		
		List<User> users = userDao.getAllUsers();
		for(User u:users){
			System.out.println(u.getName());
		}
		return userDao.getAllUsers();
	}
}
