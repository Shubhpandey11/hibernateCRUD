package hibernate_many_to_many_bidirection.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import hibernate_many_to_many_bidirection.dao.UserBankDao;
import hibernate_many_to_many_bidirection.dto.Bank;
import hibernate_many_to_many_bidirection.dto.User;




public class UserBankInsertController {

	public static void main(String[] args) {
		
		UserBankDao bankDao = new UserBankDao();
		
		List<Bank> banks = Arrays.asList(
				
			new Bank(321,"HDFC","Noida","ghjgdajd",420),
			new Bank(322,"Bob","Delhi","xysggjd",111)	
				);
				
		
		List<User> users = Arrays.asList(
				new User("Shubh",3446366,997888787,LocalDate.of(2000, 07, 19),"123",banks),
				new User("Shivam",4246366,567788877,LocalDate.of(2002, 01, 31),"123",banks)
				);
		bankDao.saveUserBankDao(users, banks);
	}

}
