package com.nt.repository;

import com.nt.model.User;

public interface UserRepository {

	public User findByEmailAndPassword(String email, String password);

	public User findByEmailandPassword(String email, String password);
}
