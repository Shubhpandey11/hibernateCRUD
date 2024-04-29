package hibernate_many_to_many_bidirection.controller;

import hibernate_many_to_many_bidirection.dao.UserDao;

public class DeleteUserController {
	
public static void main(String[] args) {
	
	UserDao userdao = new UserDao();
	userdao.deleteUserById(1);
}
}
