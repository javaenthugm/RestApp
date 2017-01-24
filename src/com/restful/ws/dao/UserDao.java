package com.restful.ws.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.restful.ws.domain.User;

public class UserDao {

	public List<User> getAllUsers() {
		System.out.println("inside DAO");
		List<User> userList = null;

		try {

			File file = new File("Users.dat");
			if (!file.exists()) {
				userList = new ArrayList<>();
				userList.add(new User(1, "Gopi", "IT"));
				saveUserList(userList);
			}else{
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
				userList = (List<User>)ois.readObject();
				ois.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return userList;
	}

	public void saveUserList(List<User> userList) {

		try {
			File userFile = new File("Users.dat");
			FileOutputStream fos = new FileOutputStream(userFile);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(userList);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void saveUser(User user){
		try{
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
