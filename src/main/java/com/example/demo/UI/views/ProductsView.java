package com.example.demo.UI.views;

import com.example.demo.model.Bread;
import com.example.demo.model.CleaningSupplies;
import com.example.demo.model.Goods;
import com.example.demo.repository.goodsRepository.GoodsRepo;
import com.example.demo.repository.goodsRepository.services.BreadServiceImpl;
import com.example.demo.repository.goodsRepository.services.GoodsServiceImpl;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductsView extends VerticalLayout {


    List<Goods> goodsList = new ArrayList<>();
    Grid<Goods> goodsGrid = new Grid<>(Goods.class);



    public ProductsView() {

        Select<String> select = new Select<>();
        select.setLabel("Select products");
        select.setItems("Bread", "Alcohol", "Drinks", "Cleaning supplies", "Frozen food", "Meat", "Milk products",
                "Sweets", "Tabacco", "Other products");


        select.addValueChangeListener(
                event -> {
                    if (event.getValue().equals("Bread"))
                        goodsGrid.setItems(listInitBread());
                    if (event.getValue().equals("Cleaning supplies"))
                        goodsGrid.setItems(listInitCleaningSup());

                });


        add(select, goodsGrid);
    }

    public List<Goods> listInitBread() {
        goodsList.clear();
        Goods goods = new Goods("chlebek", 21.00, 0.14, 55);
        Goods goods1 = new Goods("chałka", 14.00, 0.14, 85);
        Goods goods2 = new Goods("bułka", 21.00, 0.14, 25);
        Goods goods3 = new Goods("ciastko", 88.21, 0.14, 66);
        Goods goods4 = new Goods("tort", 14.55, 0.14, 21);
        goodsList.add(goods);
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);
        goodsList.add(goods4);
//        goodsList.forEach(e->goodsService.save(e));
        return goodsList;
    }

    public List<Goods> listInitCleaningSup() {
        goodsList.clear();
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
//        goodsList.forEach(e->goodsService.save(e));
        return goodsList;
    }
}


