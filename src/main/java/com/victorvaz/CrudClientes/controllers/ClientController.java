package com.victorvaz.CrudClientes.controllers;

import com.victorvaz.CrudClientes.dto.ClientDTO;
import com.victorvaz.CrudClientes.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id){
        ClientDTO dto = clientService.findById(id);
        return dto;
    }

    @GetMapping
    public Page<ClientDTO> findAll (Pageable pageable){
       return clientService.findAll(pageable);
    }

    @PostMapping
    public ClientDTO insert(@RequestBody ClientDTO dto) {
        return clientService.insert(dto);
    }
}
