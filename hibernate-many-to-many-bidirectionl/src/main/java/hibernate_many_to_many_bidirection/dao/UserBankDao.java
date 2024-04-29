package hibernate_many_to_many_bidirection.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_many_to_many_bidirection.dto.Bank;
import hibernate_many_to_many_bidirection.dto.User;



public class UserBankDao {
	EntityManager entityManager = Persistence.createEntityManagerFactory("jpa").createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    
    
    public  List <User> saveUserBankDao(List<User> users,List<Bank> banks){
    	
    	entityTransaction.begin();
    	
    	for(Bank bank : banks) {
    		entityManager.persist(bank);
    	}
    	
    	for(User user : users) {
    		entityManager.persist(user);
    	}
    	entityTransaction.commit();
    	return users;
}
    
    public void updateUserByIdDao(int userId) {
    	
//    	User user = entityManager.find(User.class, userId);
//    	
//    	if(user != null) {
    	String updateQuery = "update User u set userName = ?1 where u.userId=?2";
    	
    	Query query = entityManager.createNativeQuery(updateQuery, User.class).setParameter(2, userId);
    	
    	entityTransaction.begin();
    	query.setParameter(1, "nami");
    	query.executeUpdate();
 
    	entityTransaction.commit();
//    	}
    }
    
    public List<User> getAllData(int userId){
    	
    	User user = entityManager.find(User.class, userId);
    	
    	if(user != null) {
    		
    		String selectQuery = "select * from User u";
    		Query query = entityManager.createNativeQuery(selectQuery, User.class);
    		
    		@SuppressWarnings("unchecked")
			List<User> users = query.getResultList();
    		
    		return users;
    	}
    	return null;
    }
    
}
