package com.jsp.book_my_ticket.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
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
	
	private boolean blocked;
	
	 
	
	
	
	

}
