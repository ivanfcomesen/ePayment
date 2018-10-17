package io.interfaz.billpayment.backend.model;

import org.springframework.security.core.userdetails.UserDetails;

public class CustomSecurityUser extends User implements UserDetails   {
	
	
	private static final long serialVersionUID = 1L;

	public CustomSecurityUser () {}
	  
	  public CustomSecurityUser(User user) {
	    this.setAuthorities(user.getAuthorities());
	    this.setId(user.getId());
	    this.setPass(user.getPass());
	    this.setUserName(user.getUserName());
	  }

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
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
		return  true;
	}
}
