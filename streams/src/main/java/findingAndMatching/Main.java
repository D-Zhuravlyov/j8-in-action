package findingAndMatching;

import model.Dish;
import model.Menu;

import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparingInt;

public class Main {

    public static void main(String[] args) {

        List<Dish> menu = new Menu().getMenu();

        if(menu.stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is (somewhat) vegetarian friendly!!");
        }


        boolean isHealthy = menu.stream()
                .allMatch(d -> d.getCalories() < 1000);

        System.out.println("Is menu healthy ? - " +isHealthy);


        boolean nonHasMore1kCalories = menu.stream()
                .noneMatch(d -> d.getCalories() >= 1000);

        System.out.println("All the dishes less 1k calories: " +nonHasMore1kCalories);


        Optional<Dish> dish =
                menu.stream()
                        .filter(Dish::isVegetarian)
                        .findAny();

        dish.ifPresent(System.out::println);


        List<Dish> menu2 = new Menu().getMenu();

        menu2.sort(comparingInt(Dish::getCalories));

        /*menu2.stream().sorted(Dish::getCalories)
        .findAny();*/


    }
}
