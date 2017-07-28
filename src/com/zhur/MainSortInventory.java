package com.zhur;

import com.zhur.comparator.AppleComparator;
import com.zhur.model.Apple;
import com.zhur.model.InventoryHolder;

import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class MainSortInventory {

    public static void main(String[] args) {

        InventoryHolder inventoryHolder = new InventoryHolder();
        List<Apple> inventory = inventoryHolder.getInventory();

        System.out.println("Comparator CLASS \n");
        System.out.println("Initial: ");
        showList(inventory);
        inventory.sort(new AppleComparator());
        System.out.println("Result:");
        showList(inventory);

        System.out.println("ANON CLASS \n");
        System.out.println("Initial inventory: ");
        inventory = inventoryHolder.getInventory();
        showList(inventory);
        inventory.sort(new Comparator<Apple>() {
            public int compare(Apple a1, Apple a2) {
                return a1.getSize().compareTo(a2.getSize());
            }
        });
        System.out.println("Result:");
        showList(inventory);

        System.out.println("LAMBDA \n");
        System.out.println("Initial inventory: ");
        inventory = inventoryHolder.getInventory();
        showList(inventory);
        inventory.sort((a1, a2) -> a1.getSize().compareTo(a2.getSize())
        );
        System.out.println("Result:");
        showList(inventory);

        System.out.println("comparator.comparing: \n");
        inventory = inventoryHolder.getInventory();
        System.out.println("Initial inventory: ");
        showList(inventory);
        Comparator<Apple> c = comparing((Apple a) -> a.getSize());
        inventory.sort(c);
        System.out.println("Result:");
        showList(inventory);

        System.out.println("Method reference: \n");
        inventory = inventoryHolder.getInventory();
        System.out.println("Initial inventory: ");
        showList(inventory);
        System.out.println("Result:");
        inventory.sort(comparing(Apple::getSize));
        showList(inventory);

    }

    public static void showList(List l) {
        l.forEach(System.out::println);
    }
}
