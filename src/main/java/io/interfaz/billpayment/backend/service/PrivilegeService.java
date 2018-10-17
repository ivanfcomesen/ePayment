package io.interfaz.billpayment.backend.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.interfaz.billpayment.backend.dao.PrivilegeRepository;
import io.interfaz.billpayment.backend.model.Privilege;

@Service
public class PrivilegeService {
	
	@Autowired
	private PrivilegeRepository privilegeRepo;
	
	/* List<Privilege> getAllPrivileges() {

		List<Privilege> privileges = new ArrayList<>();
		privilegeRepo.findAll().forEach(privileges::add);
		return privileges;
	}

	public Privilege getPrivilege(Long id) {
		return privilegeRepo.findOne(id);
	}

	@Transactional
	public Privilege createPrivilegeIfNotFound(Privilege privilege) {
		
		Privilege newPrivilege = privilegeRepo.findByName(privilege.getName());
		if (newPrivilege == null) {
			newPrivilege = new Privilege(privilege);
			privilegeRepo.save(newPrivilege);
		}
		return newPrivilege;
	}
	
	public void updatePrivilege(Privilege privilege) {
		privilegeRepo.save(privilege);
	}
	public void deletePrivilege(Long id) {
		privilegeRepo.delete(id);
	}*/
	
	
	
}
