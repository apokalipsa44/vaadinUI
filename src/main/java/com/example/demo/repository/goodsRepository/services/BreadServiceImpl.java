package com.example.demo.repository.goodsRepository.services;


import com.example.demo.repository.goodsRepository.BreadRepo;
import com.example.demo.repository.goodsRepository.GoodsRepo;

public class BreadServiceImpl extends GoodsServiceImpl {

    private BreadRepo breadRepo;

    public BreadServiceImpl(GoodsRepo goodsRepo, BreadRepo breadRepo) {
        super(goodsRepo);
        this.breadRepo = breadRepo;
    }
}
