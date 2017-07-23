package com.zhur.model;

import java.util.ArrayList;
import java.util.List;

public class InventoryHolder {

  private   Apple a1 = new Apple(44, "red");
  private   Apple a2 = new Apple(34, "red");

  private List<Apple> inventory = new ArrayList<>();

    public InventoryHolder() {
        inventory.add(a1);
        inventory.add(a2);
    }

    public List<Apple> getInventory(){
        return inventory;
    }
}
