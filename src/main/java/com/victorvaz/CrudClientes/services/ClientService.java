package com.victorvaz.CrudClientes.services;

import com.victorvaz.CrudClientes.dto.ClientDTO;
import com.victorvaz.CrudClientes.entities.Client;
import com.victorvaz.CrudClientes.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){

        Client client = clientRepository.findById(id).get();
        return new ClientDTO(client);
    }

    @Transactional(readOnly = true)
    public List<ClientDTO> findAll(){
        List<Client> client = clientRepository.findAll();
        return client.stream().map(x -> new ClientDTO(x)).toList();
    }
}
