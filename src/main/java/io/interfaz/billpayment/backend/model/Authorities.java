package io.interfaz.billpayment.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "Role")
public class Authorities implements GrantedAuthority {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	
	@ManyToOne
	private User user;

	/*
	 * @ManyToMany
	 * $2a$10$UmXstMyh6K2NMYt38en6seiWvj0QkzLarvY8tPLdRfrWe50PGp9Em
	 * @JoinTable(name = "RolePrivileges", joinColumns = @JoinColumn(name =
	 * "role_id", referencedColumnName = "id"), inverseJoinColumns
	 * = @JoinColumn(name = "privilege_id", referencedColumnName = "id")) private
	 * List<Privilege> privileges;
	 */

	

	public Authorities() {
	}

	public Authorities(Authorities role) {
		this.id = role.getId();
		this.name = role.getName();
		this.description = role.getDescription();
		// this.privileges = role.getPrivileges();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * public List<Privilege> getPrivileges() { return privileges; }
	 * 
	 * public void setPrivileges(List<Privilege> privileges) { this.privileges =
	 * privileges; }
	 */

	  @Override
	  public String getAuthority() {
	    return getName();
	  }

	  public void setAuthority(String authority) {
	    this.name = getName();
	  }

	  public User getUser() {
	    return user;
	  }

	  public void setUser(User user) {
	    this.user = user;
	  }
}