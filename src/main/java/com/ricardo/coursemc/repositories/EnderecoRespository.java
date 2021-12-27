package com.ricardo.coursemc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardo.coursemc.domain.Endereco;

@Repository	
public interface EnderecoRespository extends JpaRepository<Endereco, Integer>{
	
	

}
