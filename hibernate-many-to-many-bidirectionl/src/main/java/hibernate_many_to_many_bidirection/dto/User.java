package hibernate_many_to_many_bidirection.dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private long userAccount;
	private long phone;
	private LocalDate userDob;
	
	
	public User(String userName, long userAccount, long phone, LocalDate userDob, String userPassword,
			List<Bank> bank) {
		super();
		this.userName = userName;
		this.userAccount = userAccount;
		this.phone = phone;
		this.userDob = userDob;
		this.userPassword = userPassword;
		this.banks = bank;
	}

	@CreationTimestamp
	private LocalDate userCreationdate;
	@Transient
	private String userPassword;
	
	@ManyToMany
   private List<Bank> banks;
}