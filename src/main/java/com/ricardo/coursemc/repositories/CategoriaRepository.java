package com.ricardo.coursemc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardo.coursemc.domain.Categoria;

@Repository	
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
	

}
