package com.br.projetoDebora.crudCliente.repository;


import com.br.projetoDebora.crudCliente.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findAllById(long id);
}
