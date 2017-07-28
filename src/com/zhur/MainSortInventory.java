package com.zhur;

import com.zhur.comparator.AppleComparator;
import com.zhur.model.Apple;
import com.zhur.model.InventoryHolder;

import java.util.Comparator;
import java.util.List;

public class MainSortInventory {

    public static void main(String[] args) {

        InventoryHolder inventoryHolder = new InventoryHolder();
        List<Apple> inventory = inventoryHolder.getInventory();

        inventory.sort(new AppleComparator());

        inventory.sort(new Comparator<Apple>() {
            public int compare(Apple a1, Apple a2){
                return a1.getSize().compareTo(a2.getSize());
            }
        });




    }
}
