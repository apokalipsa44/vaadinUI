package com.example.demo.services;

import com.example.demo.model.Bread;
import com.example.demo.model.CleaningSupplies;
import com.example.demo.model.Goods;
import com.example.demo.repository.goodsRepository.services.BreadServiceImpl;
import com.example.demo.repository.goodsRepository.services.CleaningSuppliesServiceImpl;
import com.example.demo.repository.goodsRepository.services.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsListService {

    List<Goods> goodsList = new ArrayList<>();

    BreadListService breadListService;
    CleaningSuppliesListService cleaningSuppliesListService;

    CleaningSuppliesServiceImpl cleaningSuppliesService;
    BreadServiceImpl breadService;





    //    @Autowired
//    public GoodsListService(BreadServiceImpl breadService, CleaningSuppliesServiceImpl cleaningSuppliesService) {
//        this.breadService = breadService;
//        this.cleaningSuppliesService = cleaningSuppliesService;
//    }

//    public List<Goods> listInitBread() {
//        goodsList.clear();
//        Iterable<Goods> goodsIterable=breadService.findAll();
//        goodsIterable.forEach(e->{
//            if(e.equals(Bread.class))
//            goodsList.add(e);
//        });
//        Goods goods = new Bread("chlebek", 21.00, 0.14, 55, "12-11-2017");
//        Goods goods1 = new Bread("chałka", 14.00, 0.14, 85, "24-09-2018");
//        Goods goods2 = new Bread("bułka", 21.00, 0.14, 25, "01-03-2019");
//        Goods goods3 = new Bread("ciastko", 88.21, 0.14, 66, "14-09-2018");
//        Goods goods4 = new Bread("tort", 14.55, 0.14, 21, "31-12-2020");
//        goodsList.add(goods);
//        goodsList.add(goods1);
//        goodsList.add(goods2);
//        goodsList.add(goods3);
//        goodsList.add(goods4);
//        goodsList.forEach(e -> breadService.save(e));
//        return goodsList;
//    }

//    public List<Goods> listInitCleaningSup() {
//        goodsList.clear();
//        Iterable<Goods> goodsIterable=cleaningSuppliesService.findAll();
//        goodsIterable.forEach(e->{
//            if(e.equals(CleaningSupplies.class))
//            goodsList.add(e);
//        });
//        Goods goods = new CleaningSupplies("domestos", 14.25, 0.24, 12);
//        Goods goods1 = new CleaningSupplies("mydło", 2.25, 0.24, 54);
//        Goods goods2 = new CleaningSupplies("kostka", 4.16, 0.24, 65);
//        Goods goods3 = new CleaningSupplies("cif kuchnia", 22.14, 0.24, 22);
//        Goods goods4 = new CleaningSupplies("cif łazienka", 55.14, 0.24, 95);
//        goodsList.add(goods);
//        goodsList.add(goods1);
//        goodsList.add(goods2);
//        goodsList.add(goods3);
//        goodsList.add(goods4);
//        goodsList.forEach(e -> cleaningSuppliesService.save(e));
//        return goodsList;
//    }
}
