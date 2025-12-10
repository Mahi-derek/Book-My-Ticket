package com.jsp.book_my_ticket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.book_my_ticket.Entity.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {



	boolean existsByEmail(String email);

	void deleteByRole(String string);

	User findByEmail(String email);

	boolean existsByMobile(Long mobile);
	
	List<User> findByRole(String string);

}
