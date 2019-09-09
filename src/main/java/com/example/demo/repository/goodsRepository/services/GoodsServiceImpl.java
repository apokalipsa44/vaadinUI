package com.example.demo.repository.goodsRepository.services;


import com.example.demo.model.Goods;
import com.example.demo.repository.goodsRepository.GoodsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class GoodsServiceImpl {
    @Autowired
    private GoodsRepo goodsRepo;


    public Optional<Goods> findById(Long id) {
        return goodsRepo.findById(id);
    }

    public Iterable<Goods> findAll() {
        return goodsRepo.findAll();
    }

    public Goods save(Goods goods) {
        return goodsRepo.save(goods);
    }

    public Goods update(Goods goods) {
        goodsRepo.deleteById(goods.getId());
        return goodsRepo.save(goods);
    }

    public void deleteById(long id) {
        goodsRepo.deleteById(id);
    }

    public Iterable<Goods> findByName(String name){
        return goodsRepo.findByName(name);
    }

    public Iterable<Goods> findByPrice(Double price){
        return goodsRepo.findByPrice(price);
    }

    public Iterable<Goods> findByStock(int stockNumber){
        return goodsRepo.findByStock(stockNumber);
    }


}
