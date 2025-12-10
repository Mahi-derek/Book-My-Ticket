package com.jsp.book_my_ticket.Service;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.jsp.book_my_ticket.dto.UserDto;

import lombok.RequiredArgsConstructor;

import java.time.Duration;


@Service
@RequiredArgsConstructor
public class RedisServiceImpl implements RedisService{

	private final RedisTemplate<String, Object> redisTemplate;
	
	@Override
	@Async
	public void saveUserDto(String email, UserDto userDto) {
		// TODO Auto-generated method stub
		redisTemplate.opsForValue().set("dto-" + email, userDto, Duration.ofMinutes(2));
	}

	@Override
	@Async
	public void saveOtp(String email, int otp) {
		// TODO Auto-generated method stub
		redisTemplate.opsForValue().set("otp-" + email, otp, Duration.ofSeconds(30));
	}

	@Override
	public UserDto getDtoByEmail(String email) {
		// TODO Auto-generated method stub
		return (UserDto) redisTemplate.opsForValue().get("dto-" + email);
	}

	@Override
	public int getOtpByEmail(String email) {
		// TODO Auto-generated method stub
		Object otp = redisTemplate.opsForValue().get("otp-" + email);
		if (otp == null)
			return 0;
		else
			return (int) otp;
	}
	

}
