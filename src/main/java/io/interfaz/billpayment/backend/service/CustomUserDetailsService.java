package io.interfaz.billpayment.backend.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import io.interfaz.billpayment.backend.dao.UserRepository;
import io.interfaz.billpayment.backend.model.User;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		/*
		 * Here we are using dummy data, you need to load user data from database or
		 * other third party application
		 */
		User user = userRepo.findByUserName(username);

		UserBuilder builder = null;
		if (user != null) {
			builder = org.springframework.security.core.userdetails.User.withUsername(username);
			builder.password(new BCryptPasswordEncoder().encode(user.getPass()));
			// builder.roles(user.getRoles());
		} else {
			throw new UsernameNotFoundException("User not found.");
		}
		return builder.build();
	}

	@Transactional
	public User createUserIfNotFound(User user) {

		User user2 = userRepo.findByUserName(user.getUserName());
		if (user2 == null) {
			user = new User(user);
			userRepo.save(user);
		}
		return user;
	}

	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		userRepo.findAll().forEach(users::add);
		return users;
	}

	public User getUser(Long id) {
		return userRepo.findOne(id);
	}

	public void updateUser(User user) {
		userRepo.save(user);
	}

	public void deleteUser(Long id) {
		userRepo.delete(id);
	}
}
