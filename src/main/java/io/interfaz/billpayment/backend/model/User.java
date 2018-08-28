package io.interfaz.billpayment.backend.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.persistence.Id;

@Table(name = "User")
@Entity
public class User {

	@GeneratedValue (strategy = GenerationType.AUTO)
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "userName")
	@Size(max = 256)
	private String userName;

	@Column(name = "pass")
	@Size(max = 256)
	private String pass;

	  @ManyToMany
	    @JoinTable( 
	        name = "UserRoles", 
	        joinColumns = @JoinColumn(
	        name = "user_id", referencedColumnName = "id"), 
	        inverseJoinColumns = @JoinColumn(
	        name = "role_id", referencedColumnName = "id")) 
	private Collection<Role> roles;
	@Column(name = "lastLogin")
	@Size(max = 128)
	private String lastLogin;


	public User() {
	}

	public User(User user) {
		this.id = user.getId();
		this.userName = user.getUserName();
		this.pass = user.getPass();
		this.roles = user.getRoles();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	public String getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

}