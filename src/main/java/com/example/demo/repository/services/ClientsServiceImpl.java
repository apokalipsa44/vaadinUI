package com.example.demo.repository.services;

import com.example.demo.model.Clients;
import com.example.demo.repository.ClientsRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientsServiceImpl {
    private ClientsRepository clientsRepository;

    public ClientsServiceImpl(ClientsRepository clientsRepository) {
        this.clientsRepository = clientsRepository;
    }

    public Iterable<Clients> findAll(){
        return clientsRepository.findAll();
    }

    public Clients save(Clients client){
        return clientsRepository.save(client);
    }
}
