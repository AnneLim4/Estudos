package br.com.projeto.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
