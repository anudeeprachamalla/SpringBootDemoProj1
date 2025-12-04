package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService service;

	@GetMapping("/hello")
	public String hello() {
		return service.getGreeting();
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		return service.getUsers();

	}
}
