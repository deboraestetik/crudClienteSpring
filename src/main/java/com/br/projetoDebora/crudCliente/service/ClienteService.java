package com.br.projetoDebora.crudCliente.service;

import com.br.projetoDebora.crudCliente.entities.Cliente;
import com.br.projetoDebora.crudCliente.repository.ClienteRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deleteById(long id) {
        clienteRepository.deleteById(id);
    }

    public Cliente saveUpdateProduto(Cliente cliente) throws NotFoundException {
        if(clienteRepository.existsById(cliente.getId())){
            return clienteRepository.save(cliente);
        }
        throw new NotFoundException("Cliente não cadastrado");
    }

    public Cliente findAllById(long id) {
        return clienteRepository.findAllById(id);
    }


}
