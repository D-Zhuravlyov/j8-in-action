package zhur.model;

import java.util.ArrayList;
import java.util.List;

public class InventoryHolder {

  private   Apple a1 = new Apple(44, "red");
  private   Apple a2 = new Apple(34, "red");
  private   Apple a3 = new Apple(66, "green");
  private   Apple a4 = new Apple(56, "red");
  private   Apple a5 = new Apple(31, "red");
  private   Apple a6 = new Apple(66, ".red");


    public List<Apple> getInventory(){
        List<Apple>  inventory = new ArrayList<>();
        inventory.add(a1);
        inventory.add(a2);
        inventory.add(a3);
        inventory.add(a4);
        inventory.add(a5);
        inventory.add(a6);
        return inventory;
    }
}
