package com.ricardo.coursemc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardo.coursemc.domain.Cliente;

@Repository	
public interface ClienteRespository extends JpaRepository<Cliente, Integer>{
	
	

}
