package hibernate_many_to_many_bidirection.controller;

import java.util.List;

import hibernate_many_to_many_bidirection.dao.UserBankDao;
import hibernate_many_to_many_bidirection.dto.User;

public class DisplayController {

	public static void main(String[] args) {
		
		UserBankDao dao = new UserBankDao();
		List<User> d = dao.getAllData(2);
System.out.println(d);
	}

}
