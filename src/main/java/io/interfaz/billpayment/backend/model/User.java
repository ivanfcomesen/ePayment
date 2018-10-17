package io.interfaz.billpayment.backend.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Table(name = "User")
@Entity
public class User {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "userName")
	@Size(max = 256)
	private String userName;

	@Column(name = "pass")
	@Size(max = 256)
	private String pass;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Authorities> authorities = new HashSet<>();

	/*
	 * @ManyToMany
	 * 
	 * @JoinTable( name = "UserRoles", joinColumns = @JoinColumn( name = "user_id",
	 * referencedColumnName = "id"), inverseJoinColumns = @JoinColumn( name =
	 * "role_id", referencedColumnName = "id")) private Collection<Authorities>
	 * roles;
	 */

	@Column(name = "lastLogin")
	@Size(max = 128)
	private String lastLogin;

	public User() {
	}

	public User(User user) {
		this.id = user.getId();
		this.userName = user.getUserName();
		this.pass = user.getPass();
		this.authorities = user.getAuthorities();
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

	/*
	 * public Collection<Authorities> getAuthorities() { return roles; }
	 * 
	 * public void setAuthorities(Collection<Authorities> roles) { this.roles =
	 * roles; }
	 */
	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Set<Authorities> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<Authorities> authorities) {
		this.authorities = authorities;
	}

}