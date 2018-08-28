package io.interfaz.billpayment.backend.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.interfaz.billpayment.backend.dao.RoleRepository;
import io.interfaz.billpayment.backend.model.Privilege;
import io.interfaz.billpayment.backend.model.Role;

@Service
public class RoleService {

	@Autowired
	private RoleRepository RoleRepo;

	public List<Role> getAllRoles() {

		List<Role> roles = new ArrayList<>();
		RoleRepo.findAll().forEach(roles::add);
		return roles;
	}

	public Role getRole(Long id) {
		return RoleRepo.findOne(id);
	}

	@Transactional
	public Role createRoleIfNotFound(Role role) {
				
		//List <Privilege> privileges = role.getPrivileges();
		 Role newRole = RoleRepo.findByName(role.getName());
		if (newRole == null) {			
			newRole  = new Role(role);
			newRole  = RoleRepo.save(newRole);
		}
		return newRole;
	}
	
	public void updateRole(Role role) {
		RoleRepo.save(role);
	}
	public void deleteRole(Long id) {
		RoleRepo.delete(id);
	}
}
