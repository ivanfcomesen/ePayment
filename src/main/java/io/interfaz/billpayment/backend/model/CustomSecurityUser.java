package io.interfaz.billpayment.backend.model;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomSecurityUser extends User implements UserDetails {

	private static final long serialVersionUID = 1L;
	PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	public CustomSecurityUser() {
	}

	public CustomSecurityUser(User user) {
		this.setAuthorities(user.getAuthorities());
		this.setId(user.getId());
		this.setPass(user.getPass());
		this.setUserName(user.getUserName());
	}

	@Override // te encontre puto
	public String getPassword() {
		return getPass();
	}

	@Override
	public String getUsername() {//debo revisar este nombre ojooooooo puto!!
		// TODO Auto-generated method stub
		return "isequeira";//
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}
