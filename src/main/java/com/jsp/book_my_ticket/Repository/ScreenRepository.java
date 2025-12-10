package com.jsp.book_my_ticket.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.book_my_ticket.Entity.Screen;
import com.jsp.book_my_ticket.Entity.Theater;



public interface ScreenRepository extends JpaRepository<Screen, Long> {

	List<Screen> findByTheater(Theater theater);

	boolean existsByNameAndTheater(String name, Theater theater);

}
