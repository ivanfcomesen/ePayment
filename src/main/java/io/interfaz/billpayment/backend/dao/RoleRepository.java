package io.interfaz.billpayment.backend.dao;

import org.springframework.data.repository.CrudRepository;
import io.interfaz.billpayment.backend.model.Authorities;

public interface RoleRepository extends CrudRepository <Authorities, Long> {

	Authorities findByName(String name);
	
}
