package com.example.demo.repository.goodsRepository.services;


import com.example.demo.repository.goodsRepository.CleaningSuppliesRepo;
import com.example.demo.repository.goodsRepository.GoodsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CleaningSuppliesServiceImpl extends GoodsServiceImpl {

    private CleaningSuppliesRepo cleaningSuppliesRepo;
    @Autowired
    public CleaningSuppliesServiceImpl(GoodsRepo goodsRepo, CleaningSuppliesRepo cleaningSuppliesRepo) {

        this.cleaningSuppliesRepo = cleaningSuppliesRepo;
    }
}
