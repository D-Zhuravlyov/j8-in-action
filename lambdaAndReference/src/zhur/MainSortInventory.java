package zhur;


import zhur.comparator.AppleComparator;
import zhur.model.Apple;
import zhur.model.InventoryHolder;

import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

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
                return Integer.compare(a1.getSize(), a2.getSize());
            }
        });
        System.out.println("Result:");
        showList(inventory);

        System.out.println("LAMBDA \n");
        System.out.println("Initial inventory: ");
        inventory = inventoryHolder.getInventory();
        showList(inventory);
        inventory.sort((a1, a2) -> Integer.compare(a1.getSize(), a2.getSize())
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
        inventory.sort(comparingInt(Apple::getSize));
        showList(inventory);

        System.out.println("Reverced sort: \n");
        inventory = inventoryHolder.getInventory();
        System.out.println("Initial inventory: ");
        showList(inventory);
        Comparator<Apple> c1 = Comparator.comparingInt(Apple::getSize);
        c1 = c1.reversed();
        System.out.println("Result: ");
        inventory.sort(c1);
        showList(inventory);

        System.out.println("Reverced sort thenComparing: \n");
        inventory = inventoryHolder.getInventory();
        System.out.println("Initial inventory: ");
        showList(inventory);
        System.out.println("Result: ");
        inventory.sort(comparingInt(Apple::getSize)
                .reversed()
                .thenComparing(Apple::getColor));
        showList(inventory);
    }

    public static void showList(List l) {
        l.forEach(System.out::println);
    }
}
