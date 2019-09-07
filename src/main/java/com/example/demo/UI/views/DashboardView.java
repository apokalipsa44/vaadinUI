package com.example.demo.UI.views;

import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class DashboardView extends HorizontalLayout {


    public DashboardView() {
        Icon icon=new Icon(VaadinIcon.ALARM);
        icon.setSize("150px");
        add(icon);
    }
}
