package io.interfaz.billpayment.backend.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.interfaz.billpayment.backend.dao.RoleRepository;
import io.interfaz.billpayment.backend.model.Privilege;
import io.interfaz.billpayment.backend.model.Authorities;

@Service
public class RoleService {

	@Autowired
	private RoleRepository RoleRepo;

	public List<Authorities> getAllRoles() {

		List<Authorities> roles = new ArrayList<>();
		RoleRepo.findAll().forEach(roles::add);
		return roles;
	}
/*
	public Authorities getRole(Long id) {
		return RoleRepo.findOne(id);
	}

	@Transactional
	public Authorities createRoleIfNotFound(Authorities role) {
				
		//List <Privilege> privileges = role.getPrivileges();
		 Authorities newRole = RoleRepo.findByName(role.getName());
		if (newRole == null) {			
			newRole  = new Authorities(role);
			newRole  = RoleRepo.save(newRole);
		}
		return newRole;
	}
	
	public void updateRole(Authorities role) {
		RoleRepo.save(role);
	}
	public void deleteRole(Long id) {
		RoleRepo.delete(id);
	}*/
}
