package hibernate_many_to_many_bidirection.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_many_to_many_bidirection.dto.User;

public class UserDao {

	EntityManager entityManager = Persistence.createEntityManagerFactory("jpa").createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    
public void deleteUserById(int id) {
	
	
	User user = entityManager.find(User.class,id);
	
	String deleteUserQuery = "delete from user_bank where users_userId=?";
	
	Query query = entityManager.createNativeQuery(deleteUserQuery);
	
	query.setParameter(1,id);
	
	if (user!=null) {
		
		entityTransaction.begin();
		entityManager.remove(user);
		entityTransaction.commit();
	}
}
}
