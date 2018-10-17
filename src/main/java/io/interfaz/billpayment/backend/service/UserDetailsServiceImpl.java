package io.interfaz.billpayment.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.interfaz.billpayment.backend.dao.UserRepository;
import io.interfaz.billpayment.backend.model.CustomSecurityUser;
import io.interfaz.billpayment.backend.model.User;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	  @Autowired
	  private UserRepository userRepo;
	  
	  @Override
	  public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
	    
	    User user = userRepo.findByUserName(userName);
	    
	    if (user == null)
	      throw new UsernameNotFoundException("Username and or password was incorrect.");
	    
	    return new CustomSecurityUser(user);
	  }
/*	  
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
		}*/
}