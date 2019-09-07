package com.example.demo.UI.views;

import com.example.demo.UI.MainLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

import static com.vaadin.flow.component.Tag.NAV;

@Route(value = NAV, layout = MainLayout.class)
public class ProfileView extends HorizontalLayout {

    public static final String NAV = "dashbord";


    public ProfileView() {

        Image image = new Image("frontend/images/alcohol.jpg", "alt text");
        add(image);
    }
}
