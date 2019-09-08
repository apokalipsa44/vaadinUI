package com.example.demo.repository.goodsRepository;


import com.example.demo.model.Goods;
import org.springframework.data.repository.CrudRepository;

public interface GoodsRepo extends CrudRepository<Goods, Long> {

    public Iterable<Goods> findByName(String name);

    public Iterable<Goods> findByPrice(Double price);

    public Iterable<Goods> findByStock(int stockNumber);
}
