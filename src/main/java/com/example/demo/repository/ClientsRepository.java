package com.example.demo.repository;

import com.example.demo.model.Clients;
import org.springframework.data.repository.CrudRepository;

public interface ClientsRepository extends CrudRepository<Clients, Long> {
}
