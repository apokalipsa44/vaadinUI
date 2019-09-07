package com.example.demo.UI.views;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class ProfileView extends HorizontalLayout {

    public ProfileView() {

        Image image= new Image("frontend/images/alcohol.jpg", "alt text");
        add(image);
    }
}
