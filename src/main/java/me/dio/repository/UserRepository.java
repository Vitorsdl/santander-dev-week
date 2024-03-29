package me.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.domain.model.User;
import me.dio.domain.repository.Long;
import me.dio.domain.repository.String;

@Repository
public class UserRepository extends JpaRepository<User, Long> {
	
	boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);

}
