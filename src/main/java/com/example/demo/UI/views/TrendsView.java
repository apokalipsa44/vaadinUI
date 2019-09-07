package com.example.demo.UI.views;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class TrendsView extends HorizontalLayout {
    public TrendsView() {
        Image image= new Image("frontend/images/bread.jpg", "alt text");
        add(image);
    }
}
