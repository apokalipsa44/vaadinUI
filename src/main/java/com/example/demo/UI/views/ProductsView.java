package com.example.demo.UI.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

public class ProductsView extends VerticalLayout {

    public ProductsView() {

    Select<String> select = new Select<>();
select.setLabel("Select products");
select.setItems("Bread", "Alcohol", "Drinks", "Cleaning supplies", "Frozen food", "Meat", "Milk products", "Sweets", "Tabacco", "Other products");

    Div value = new Div();
value.setText("Select a value");
select.addValueChangeListener(
    event -> value.setText("Selected: " + event.getValue()));

add(select);

    }

}
