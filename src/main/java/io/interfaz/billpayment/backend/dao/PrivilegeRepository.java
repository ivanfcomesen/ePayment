package io.interfaz.billpayment.backend.dao;

import org.springframework.data.repository.CrudRepository;

import io.interfaz.billpayment.backend.model.Privilege;

public interface PrivilegeRepository extends CrudRepository <Privilege, Long> {

	Privilege findByName(String name);
 
}
