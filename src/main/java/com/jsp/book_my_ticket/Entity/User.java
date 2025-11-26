package com.jsp.book_my_ticket.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false,unique=true)
	private String email;
	
	
	@Column(nullable = false)
	private long mobile;
	
	@Column(nullable = false)
	private String password;
	
	
	@Column(nullable = false)
	private String role;
	
	 
	
	
	
	

}
