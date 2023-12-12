package com.victorvaz.CrudClientes.controllers;

import com.victorvaz.CrudClientes.entities.Client;
import com.victorvaz.CrudClientes.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/{id}")
    public Client findById(@PathVariable Long id){

        Client client = clientService.findById(id);
        return client;
    }
}
