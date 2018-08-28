package io.interfaz.billpayment.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.interfaz.billpayment.backend.model.Role;
import io.interfaz.billpayment.backend.service.RoleService;

@RestController
public class RolController {
	
	@Autowired
	private RoleService roleService;

	@RequestMapping("/roles")
	public List<Role> getAllRoles() {
		return roleService.getAllRoles();
	}

	@RequestMapping("/role/{id}")
	public Role getRole(@PathVariable Long id) {
		return roleService.getRole(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/role")
	public void addRole(@RequestBody Role role) {
		roleService.createRoleIfNotFound(role);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/role/{id}")
	public void updateRole(@RequestBody Role role, @PathVariable Long id) {
		role.setId(id);
		roleService.updateRole(role);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/role/{id}")
	public void deleteRole(@PathVariable Long id) {
		roleService.deleteRole(id);
	}

}