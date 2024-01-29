package com.nt.service;

import com.nt.model.User;

public interface UserService {

	public User findUserByEmail(String email, String password);
}
