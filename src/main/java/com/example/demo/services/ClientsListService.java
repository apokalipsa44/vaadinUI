package com.example.demo.services;

import com.example.demo.model.Clients;
import com.example.demo.repository.services.ClientsServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientsListService {

    private ClientsServiceImpl clientsRepository;

    public ClientsListService(ClientsServiceImpl clientsRepository) {
        this.clientsRepository = clientsRepository;

        Clients client1=new Clients("Jan", "Kowalski", "665484244");
        Clients client2=new Clients("Kuba", "Kutalski", "648422555");
        Clients client3=new Clients("Marian", "Italiano", "74481515");
        Clients client4=new Clients("Jarek", "Szczygieł", "661515454");

        clientsRepository.save(client1);
        clientsRepository.save(client2);
        clientsRepository.save(client3);
        clientsRepository.save(client4);

    }

    public List<Clients> createClientsList(){
        Iterable<Clients> clientsIterable=clientsRepository.findAll();
        List<Clients>clientsList=new ArrayList<>();
        clientsIterable.forEach(e->clientsList.add(e));
        return clientsList;
    }

}
