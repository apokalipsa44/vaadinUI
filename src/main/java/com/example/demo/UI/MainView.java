package com.example.demo.UI;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("Main-view")
public class MainView extends VerticalLayout {

    public MainView() {
        Image image= new Image("frontend/images/burger.png", "alt burger");
        add(image);
    }
}
