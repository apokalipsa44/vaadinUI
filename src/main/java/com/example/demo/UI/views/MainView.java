package com.example.demo.UI.views;

import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import javax.swing.*;

public class MainView extends HorizontalLayout {
    public MainView() {
    Icon icon=new Icon(VaadinIcon.DASHBOARD);
    add(icon);
    }

}
