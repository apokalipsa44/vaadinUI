package com.example.demo.repository.goodsRepository.services;


import com.example.demo.repository.goodsRepository.CleaningSuppliesRepo;
import com.example.demo.repository.goodsRepository.GoodsRepo;

public class CleaningSuppliesServiceImpl extends GoodsServiceImpl {

    private CleaningSuppliesRepo cleaningSuppliesRepo;

    public CleaningSuppliesServiceImpl(GoodsRepo goodsRepo, CleaningSuppliesRepo cleaningSuppliesRepo) {
        super(goodsRepo);
        this.cleaningSuppliesRepo = cleaningSuppliesRepo;
    }
}
