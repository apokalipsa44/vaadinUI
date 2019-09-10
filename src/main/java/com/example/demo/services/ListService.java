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

//    Map<String, GoodsListService> goodsListServiceList;
//    BreadServiceImpl breadService;
//    CleaningSuppliesServiceImpl cleaningSuppliesService;
//
//    @Autowired
//    public ListService(Map<String, GoodsListService> goodsListServiceList, BreadServiceImpl breadService, CleaningSuppliesServiceImpl cleaningSuppliesService) {
//        this.goodsListServiceList = map();
//        this.breadService=breadService;
//        this.cleaningSuppliesService=cleaningSuppliesService;
//    }

    private Set<String>listString;

    @Autowired
    public ListService(Set<String> listString) {
        this.listString = set();
    }

    public List<Goods> listInint(String listType){
        if (listType.equals("Bread")){
            return listString.("breadListService").breadListService.listInitBread();
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

    @Bean
    public Set<String> set(){
        Set<String> lstSet = new HashSet<>();
        lstSet.add("breadListService");
        lstSet.add("cleaningSuppliesListService");
        return lstSet;
    }
}
package com.memorynotfound.spring.core.autowired;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.factory.annotation.Qualifier;
        import org.springframework.stereotype.Component;

//@Component
//public class SellPhone {
//
//    @Autowired
//    @Qualifier(value = "mysqlMessageRepository")
//    private MessageRepository mysqlMessageRepository;
//
//    @Autowired
//    @Qualifier(value = "inMemoryMessageRepository")
//    private MessageRepository inMemoryMessageRepository;
//
//    public void sendMessage(){
//        mysqlMessageRepository.save();
//        inMemoryMessageRepository.save();
//    }
//}