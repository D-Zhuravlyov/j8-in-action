package com.zhur;

import com.zhur.model.Apple;
import com.zhur.model.InventoryHolder;

import java.util.List;

public class MainSortInventory {

    public static void main(String[] args) {

        InventoryHolder inventoryHolder = new InventoryHolder();
        List<Apple> inventory = inventoryHolder.getInventory();

    }
}
