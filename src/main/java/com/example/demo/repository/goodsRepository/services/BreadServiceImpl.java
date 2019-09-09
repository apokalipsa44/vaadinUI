package com.example.demo.repository.goodsRepository.services;


import com.example.demo.repository.goodsRepository.BreadRepo;
import com.example.demo.repository.goodsRepository.GoodsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BreadServiceImpl extends GoodsServiceImpl {

    private BreadRepo breadRepo;

    @Autowired
    public BreadServiceImpl(GoodsRepo goodsRepo, BreadRepo breadRepo) {
        this.breadRepo = breadRepo;
    }
}
