package com.example.demo.services;

import com.example.demo.model.Goods;
import com.example.demo.repository.goodsRepository.services.BreadServiceImpl;
import com.example.demo.repository.goodsRepository.services.CleaningSuppliesServiceImpl;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ListService {


    BreadServiceImpl breadService;
    CleaningSuppliesServiceImpl cleaningSuppliesService;

    public List<Goods> listInint(String listType) {
        if (listType.equals("Bread")) {
            return new BreadListService(breadService).listInitBread();
        }
        if (listType.equals("Cleaning supplies")) {
            return new CleaningSuppliesListService(cleaningSuppliesService).listInitCleaningSup();
        }
        return null;
    }


}


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