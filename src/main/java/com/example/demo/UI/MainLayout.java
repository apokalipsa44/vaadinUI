package com.example.demo.UI;

import com.example.demo.UI.views.*;
import com.example.demo.services.ProductsListService;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Component
@Route("puppy")
public class MainLayout extends AppLayout {
    private static final String LOGO_PNG = "logo.png";


    // ---------mapa gdzie trzyma relacje miedzy ramką a pozycją menu
    private Map<Tab, Component> tab2Workspace = new HashMap<>();
private ProductsListService productsListService;
private ProductsView  productsView;
    @Autowired
    public MainLayout(ProductsListService productsListService, ProductsView productsView) {
        this.productsListService=productsListService;
        this.productsView=productsView;





//-------content czyli ramka
        setContent(new Label("ssij"));
//-------koniec ramki

        //------- menu, drawer czyli bedzie się wysówać
        StreamResource res = new StreamResource(LOGO_PNG,
                () -> MainView.class.getResourceAsStream("/" + LOGO_PNG));
//        Image img = new Image(res, "Vaadin Logo");
//        Image img2= new Image("frontend/images/burger.png", "alt burger");
//        img.setHeight("100px");


        addToNavbar(new DrawerToggle());
        //------- koniec menu


        final Tabs tabs = new Tabs(dashBoard(), user(), trends());
        tabs.setOrientation(Tabs.Orientation.VERTICAL);
        tabs.addSelectedChangeListener(event -> {
            final Tab selectedTab = event.getSelectedTab();             // wybiera dla każdego wybranego
            final Component component = tab2Workspace.get(selectedTab); // jego komponent (ramkę) z mapy
            setContent(component);
        });
        addToDrawer(tabs);


    }

    // ------ -pozycje menu
    private Tab dashBoard() {
        final Span label = new Span("Products");
        final Icon icon = VaadinIcon.DASHBOARD.create();
        final Tab tab = new Tab(new HorizontalLayout(icon, label));
        tab2Workspace.put(tab, new ProductsView(productsListService));
        return tab;
    }

    private Tab trends() {
        final Span label = new Span("Clients");
        final Icon icon = VaadinIcon.TRENDING_UP.create();
        final Tab tab = new Tab(new HorizontalLayout(icon, label));
        tab2Workspace.put(tab, new ClientsView());
        return tab;
    }

    private Tab user() {
        final Span label = new Span("Sales");
        final Icon icon = VaadinIcon.USER.create();
        final Tab tab = new Tab(new HorizontalLayout(icon, label));
        tab2Workspace.put(tab, new SalesView());
        return tab;
    }

//    private Tab logout() {
//        final Icon icon  = SIGN_OUT.create();
//        final Button btn = new Button();
//        btn.setText(getTranslation(ITM_LOGOUT));
//        btn.setIcon(icon);
//        btn.addClickListener(e -> {
//            UI ui = UI.getCurrent();
//            VaadinSession session = ui.getSession();
//            session.setAttribute(SecurityService.User.class , null);
//            session.close();
//            ui.navigate(MainView.class);
//        });
//        btn.setSizeFull();
//        final Tab    tab   = new Tab(btn);
////    tab2Workspace.put(tab, new TrendsView());
//        return tab;
//    }
}


