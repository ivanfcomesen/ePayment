package io.interfaz.billpayment.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.interfaz.billpayment.backend.model.Privilege;
import io.interfaz.billpayment.backend.service.PrivilegeService;

@RestController
public class PrivilegeController {

	@Autowired
	private PrivilegeService privilegeService;
	
	/*
	@RequestMapping("/privileges")
	public List<Privilege> getAllPrivileges() {
		return privilegeService.getAllPrivileges();		
	}

	@RequestMapping("/privileges/{id}")
	public Privilege getUser(@PathVariable Long id) {
		return privilegeService.getPrivilege(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/privilege")
	public void addPrivilege(@RequestBody Privilege privilege) {
		privilegeService.createPrivilegeIfNotFound(privilege);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/privilege/{id}")
	public void updateUser(@RequestBody Privilege privilege, @PathVariable Long id) {
		privilege.setId(id);
		privilegeService.updatePrivilege(privilege);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/privilege/{id}")
	public void deleteUser(@PathVariable Long id) {
		privilegeService.deletePrivilege(id);
	}*/
}