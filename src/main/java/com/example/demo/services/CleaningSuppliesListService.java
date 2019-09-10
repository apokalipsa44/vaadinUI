package com.example.demo.services;

import com.example.demo.model.CleaningSupplies;
import com.example.demo.model.Goods;
import com.example.demo.repository.goodsRepository.services.CleaningSuppliesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CleaningSuppliesListService extends GoodsListService{

    List<Goods> goodsList = new ArrayList<>();

    CleaningSuppliesServiceImpl cleaningSuppliesService;

    @Autowired
    public CleaningSuppliesListService(CleaningSuppliesServiceImpl cleaningSuppliesService) {
        this.cleaningSuppliesService = cleaningSuppliesService;
    }

    public List<Goods> listInitCleaningSup() {
        goodsList.clear();
        Iterable<Goods> goodsIterable=cleaningSuppliesService.findAll();
        goodsIterable.forEach(e->{
            if(e.equals(CleaningSupplies.class))
                goodsList.add(e);
        });
        Goods goods = new CleaningSupplies("domestos", 14.25, 0.24, 12);
        Goods goods1 = new CleaningSupplies("mydło", 2.25, 0.24, 54);
        Goods goods2 = new CleaningSupplies("kostka", 4.16, 0.24, 65);
        Goods goods3 = new CleaningSupplies("cif kuchnia", 22.14, 0.24, 22);
        Goods goods4 = new CleaningSupplies("cif łazienka", 55.14, 0.24, 95);
        goodsList.add(goods);
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);
        goodsList.add(goods4);
        goodsList.forEach(e -> cleaningSuppliesService.save(e));
        return goodsList;
    }
}
