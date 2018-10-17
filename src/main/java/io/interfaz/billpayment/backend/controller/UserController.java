package io.interfaz.billpayment.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.interfaz.billpayment.backend.model.User;
import io.interfaz.billpayment.backend.service.UserDetailsServiceImpl;

@RestController
public class UserController {

	@Autowired
	private UserDetailsServiceImpl  userDetailsService;
/*

	@RequestMapping("/users")
	public List<User> getAllUsers() {
		return userDetailsService.getAllUsers();
	}

	@RequestMapping("/user/{id}")
	public User getUser(@PathVariable Long id) {
		return userDetailsService.getUser(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/user")
	public void addUser(@RequestBody User user) {
		userDetailsService.loadUserByUsername(user.getUserName());
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/user/{id}")
	public void updateUser(@RequestBody User user, @PathVariable Long id) {
		user.setId(id);
		userDetailsService.updateUser(user);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/user/{id}")
	public void deleteUser(@PathVariable Long id) {
		userDetailsService.deleteUser(id);
	}
*/
}

