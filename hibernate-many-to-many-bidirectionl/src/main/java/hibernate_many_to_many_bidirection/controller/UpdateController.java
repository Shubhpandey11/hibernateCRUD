package hibernate_many_to_many_bidirection.controller;

import hibernate_many_to_many_bidirection.dao.UserBankDao;

public class UpdateController {

	public static void main(String[] args) {
		UserBankDao dao = new UserBankDao();
		dao.updateUserByIdDao(2);

	}

}
