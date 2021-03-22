package com.br.projetoDebora.crudCliente.controller;


import com.br.projetoDebora.crudCliente.entities.Cliente;
import com.br.projetoDebora.crudCliente.service.ClienteService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @CrossOrigin
    @GetMapping("/{id}")
    public Cliente listaClientePorId(@PathVariable(value = "id") long id) {
        return clienteService.findAllById(id);
    }

    @CrossOrigin
    @GetMapping("")
    public List<Cliente> listaCliente() {
        return clienteService.findAll();
    }

    @CrossOrigin
    @PostMapping(value = "")
    public Cliente saveCliente(@RequestBody Cliente cliente) {
        return clienteService.saveCliente(cliente);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable(value = "id") long id) {
        clienteService.deleteById(id);
    }

    @CrossOrigin
    @PutMapping("")
    public Cliente updateCliente(@RequestBody Cliente cliente) throws NotFoundException {
        return clienteService.saveUpdateProduto(cliente);
    }

//    @CrossOrigin
//    @PutMapping("/{id}")
//    public Cliente updateClienteById(@PathVariable(value = "id") long id) throws NotFoundException {
//        return clienteService.saveUpdateProdutoById(id);
//    }

}
