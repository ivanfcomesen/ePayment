package io.interfaz.billpayment.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.interfaz.billpayment.backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select u from User u" + " left join fetch u.authorities" + " where u.userName = :userName")
	User findByUserName( @Param("userName")  String userName);

	// Crear aqui metodo que consulta la tabla intermedia

}
