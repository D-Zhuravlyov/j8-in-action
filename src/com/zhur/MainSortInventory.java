package com.zhur;

import com.zhur.comparator.AppleComparator;
import com.zhur.model.Apple;
import com.zhur.model.InventoryHolder;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.Comparator;
import java.util.List;

public class MainSortInventory {

    public static void main(String[] args) {

        InventoryHolder inventoryHolder = new InventoryHolder();
        List<Apple> inventory = inventoryHolder.getInventory();

        System.out.println("Comparator CLASS");
        System.out.println("Initial: ");
        showList(inventory);
        inventory.sort(new AppleComparator());
        System.out.println("Result:");
        showList(inventory);

        System.out.println("ANON CLASS");
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

        System.out.println("LAMBDA");
        System.out.println("Initial inventory: ");
        inventory = inventoryHolder.getInventory();
        showList(inventory);
        inventory.sort((a1, a2) -> a1.getSize().compareTo(a2.getSize())
        );
        System.out.println("Result:");
        showList(inventory);

        System.out.printf("comparator.comparing: \n");
        System.out.println("Initial inventory: ");
        inventory = inventoryHolder.getInventory();
        Comparator<Apple> c = Comparator.comparing((Apple a) -> a.getSize());
        inventory.sort(c);
        System.out.println("Result:");
        showList(inventory);

    }

    public static void showList(List l) {
        l.forEach(System.out::println);
    }
}
