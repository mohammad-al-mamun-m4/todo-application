package com.example.demo.serviceImp;

import java.util.Arrays;


import org.springframework.stereotype.Service;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepo;
	public UserServiceImpl(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}


	@Override
	public User save(UserRegistrationDto userRegistrationDto) {
		User user = new User(userRegistrationDto.getFirstName(),
				userRegistrationDto.getLastName(),
				userRegistrationDto.getEmail(),
				userRegistrationDto.getPassword(),
				Arrays.asList(new Role("ROLE_USER")));
		
		return userRepo.save(user);
	}
	

}
