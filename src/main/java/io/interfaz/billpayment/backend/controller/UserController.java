package io.interfaz.billpayment.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.interfaz.billpayment.backend.model.User;
import io.interfaz.billpayment.backend.service.CustomUserDetailsService;

@RestController
public class UserController {

	@Autowired
	private CustomUserDetailsService customUserService;


	@RequestMapping("/users")
	public List<User> getAllUsers() {
		return customUserService.getAllUsers();
	}

	@RequestMapping("/user/{id}")
	public User getUser(@PathVariable Long id) {
		return customUserService.getUser(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/user")
	public void addUser(@RequestBody User user) {
		customUserService.createUserIfNotFound(user);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/user/{id}")
	public void updateUser(@RequestBody User user, @PathVariable Long id) {
		user.setId(id);
		customUserService.updateUser(user);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/user/{id}")
	public void deleteUser(@PathVariable Long id) {
		customUserService.deleteUser(id);
	}

}

