package com.example.demo.repository.goodsRepository;


import com.example.demo.model.Bread;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BreadRepo extends CrudRepository<Bread, Long> {
    public Optional<Bread> findByExpDate(Double expDate);
}
