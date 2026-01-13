package com.rest.api.user;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepository;
	
	public List<UserModel> getAllUsers() {
	    return userRepository.findAll();
	}

}
