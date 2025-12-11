package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.User;

@Service
public class HelloService {

	public String getGreeting() {
		return "welcome to Springboot Application";
	}

	public List<User> getUsers() {
		return List.of(new User(101, "anudeepRachamalla"), new User(102, "swethaRachamalla"),
				new User(103, "sandeepRachamalla"));
	}
}
