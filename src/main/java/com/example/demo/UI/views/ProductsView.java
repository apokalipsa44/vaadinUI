package com.example.demo.UI.views;

import com.example.demo.model.Bread;
import com.example.demo.model.CleaningSupplies;
import com.example.demo.model.Goods;
import com.example.demo.repository.goodsRepository.services.GoodsServiceImpl;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Controller
public class ProductsView extends VerticalLayout {

    @Autowired
    private GoodsServiceImpl goodsService;

    List<Goods> goodsList = new ArrayList<>();
    Grid<Goods> goodsGrid = new Grid<>(Goods.class);

    public ProductsView() {

        Select<String> select = new Select<>();
        select.setLabel("Select products");
        select.setItems("Bread", "Alcohol", "Drinks", "Cleaning supplies", "Frozen food", "Meat", "Milk products", "Sweets", "Tabacco", "Other products");

//        Div value = new Div();
//        value.setText("Select a value");
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
        Goods goods = new Bread("chlebek", 21.00, 0.14, 55, "22-12-2014");
        goodsService.save(goods);
        Goods goods1 = new Bread("chałka", 14.00, 0.14, 85, "04-12-2014");
        Goods goods2 = new Bread("bułka", 21.00, 0.14, 25, "14-11-2014");
        Goods goods3 = new Bread("ciastko", 88.21, 0.14, 66, "15-02-2019");
        Goods goods4 = new Bread("tort", 14.55, 0.14, 21, "01-05-2018");
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


