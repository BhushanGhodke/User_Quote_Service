package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.binding.UserLoginForm;
import com.nt.model.User;
import com.nt.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
 
	@GetMapping("/login")
	public ResponseEntity<String> userLogin(@RequestBody UserLoginForm userLoginForm   ){
	
	//use service
		User user = userService.findUserByEmail(userLoginForm.getEmail(), userLoginForm.getPassword());
	
		if(user==null) {
			return new ResponseEntity<String>("Invalid Credential", HttpStatus.BAD_REQUEST);
		}
		else {
			return new ResponseEntity<String>("Login Success", HttpStatus.OK);
		}
	}


}
