package com.nt.binding;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class UserLoginForm {

	
	private String  email;
	private String password;
}
