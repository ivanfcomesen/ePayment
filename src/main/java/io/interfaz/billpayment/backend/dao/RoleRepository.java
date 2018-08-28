package io.interfaz.billpayment.backend.dao;

import org.springframework.data.repository.CrudRepository;
import io.interfaz.billpayment.backend.model.Role;

public interface RoleRepository extends CrudRepository <Role, Long> {

	Role findByName(String name);
	
}
