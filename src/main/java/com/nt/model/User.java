package com.nt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
 
	private String name;
	private String email;
	private String password;
	private long mobile;
	private String Country;
	private String state;
	private String city;

}
