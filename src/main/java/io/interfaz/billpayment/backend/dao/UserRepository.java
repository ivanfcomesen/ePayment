package io.interfaz.billpayment.backend.dao;

import org.springframework.data.repository.CrudRepository;
import io.interfaz.billpayment.backend.model.User;

public interface UserRepository extends CrudRepository<User,Long> {

	User findByUserName(String userName);
	

}
