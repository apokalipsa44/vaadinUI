package com.example.demo.services;

import com.example.demo.model.Bread;
import com.example.demo.model.Goods;
import com.example.demo.repository.goodsRepository.services.BreadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BreadListService {
    List<Goods> goodsList = new ArrayList<>();

    BreadServiceImpl breadService;

    @Autowired
    public BreadListService(BreadServiceImpl breadService) {
        this.breadService = breadService;
    }

    public List<Goods> listInitBread() {
        goodsList.clear();
        Iterable<Goods> goodsIterable=breadService.findAll();
        goodsIterable.forEach(e->{
            if(e.equals(Bread.class))
                goodsList.add(e);
        });
        Goods goods = new Bread("chlebek", 21.00, 0.14, 55, "12-11-2017");
        Goods goods1 = new Bread("chałka", 14.00, 0.14, 85, "24-09-2018");
        Goods goods2 = new Bread("bułka", 21.00, 0.14, 25, "01-03-2019");
        Goods goods3 = new Bread("ciastko", 88.21, 0.14, 66, "14-09-2018");
        Goods goods4 = new Bread("tort", 14.55, 0.14, 21, "31-12-2020");
        goodsList.add(goods);
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);
        goodsList.add(goods4);
        goodsList.forEach(e -> breadService.save(e));
        return goodsList;
    }
}
