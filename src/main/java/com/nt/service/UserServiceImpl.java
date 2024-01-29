package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.User;
import com.nt.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	

	@Override
	public User findUserByEmail(String email, String password) {
return  userRepository.findByEmailandPassword(email, password);
		
	}
	


}
