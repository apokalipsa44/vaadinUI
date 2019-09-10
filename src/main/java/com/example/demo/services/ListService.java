package com.example.demo.services;

import com.example.demo.model.Goods;
import com.example.demo.repository.goodsRepository.services.BreadServiceImpl;
import com.example.demo.repository.goodsRepository.services.CleaningSuppliesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ListService {
private final String goodType = "breadListService";

    Map<String, GoodsListService> goodsListServiceList;
    BreadServiceImpl breadService;
    CleaningSuppliesServiceImpl cleaningSuppliesService;

    @Autowired
    public ListService(Map<String, GoodsListService> goodsListServiceList) {
        this.goodsListServiceList = map();
    }


        public List<Goods> listInint(String listType){
        if (listType.equals("Bread")){
            return goodsListServiceList.get("breadListService").breadListService.listInitBread();
        }
        if (listType.equals("Cleaning supplies")){
            return goodsListServiceList.get("cleaningSuppliesListService").cleaningSuppliesListService.listInitCleaningSup();
        }
        else return null;
    }

    @Bean
    public Map<String, GoodsListService> map () {
        HashMap<String, GoodsListService> map = new HashMap<>();
        map.put("breadListService", new BreadListService(breadService));
        map.put("cleaningSuppliesListService", new CleaningSuppliesListService(cleaningSuppliesService));
        return map;
    }

}
