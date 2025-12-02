package com.jsp.book_my_ticket.Service;

import com.jsp.book_my_ticket.dto.UserDto;

public interface RedisService {
	void saveUserDto(String email, UserDto userDto);

	void saveOtp(String email, int otp);

	UserDto getDtoByEmail(String email);

	int getOtpByEmail(String email);
}
