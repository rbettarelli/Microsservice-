package com.ricardo.coursemc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardo.coursemc.domain.Produto;

@Repository	
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	
	

}
