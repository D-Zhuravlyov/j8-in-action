package model;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Dish> menu;

    private Dish d1 = new Dish(1000, false);
    private Dish d2 = new Dish(400, false);
    private Dish d3 = new Dish(2345, false);
    private Dish d4 = new Dish(100, true);
    private Dish d5 = new Dish(500, true);
    private Dish d6 = new Dish(2345, false);

    public List<Dish> getMenu() {
        menu = new ArrayList<>();
        menu.add(d1);
        menu.add(d2);
        menu.add(d3);
        menu.add(d4);
        menu.add(d5);
        menu.add(d6);
        return menu;
    }
}
