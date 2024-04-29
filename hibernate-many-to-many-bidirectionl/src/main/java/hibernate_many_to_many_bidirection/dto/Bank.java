package hibernate_many_to_many_bidirection.dto;

import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank {

	
	
	

		@Id
		private int id;
		private String name;
		private String address;
		private String ifsccode;
		private int branchcode;
}
