package com.jsp.book_my_ticket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.book_my_ticket.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	boolean existsByEmail(String email);
	void deleteByRole(String string);

}
