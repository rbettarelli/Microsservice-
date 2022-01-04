package com.ricardo.coursemc.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ricardo.coursemc.domain.Cliente;
import com.ricardo.coursemc.domain.Pedido;

@Repository	
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
	
	
	
	@Transactional(readOnly=true)
	Page<Pedido> findByCliente(Cliente cliente, Pageable pageRequest);
	
	

	
}
