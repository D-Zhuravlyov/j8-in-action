package impl;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorBasedRef {

    public static void main(String[] args) {

        Supplier<Apple> s1 = Apple::new;
        Apple appleFromRef = s1.get();

        Function<Integer, Apple> s2 = Apple::new;
        Apple appleFromRefInt = s2.apply(22);

     /*   System.out.println(appleFromRef);
        System.out.println(appleFromRefInt);*/

        List<Integer> weights = Arrays.asList(3, 4, 5, 6, 12, 6);

        List<Apple> apples = map(weights, Apple::new);

        List<Apple> apples2 = map2(weights, Apple::new, "red");

      /*  System.out.println("MAP: ");
        for (Apple a:
                apples
                ) {
            System.out.println(a);
        }*/

        /*System.out.println("MAP2: ");
        for (Apple a:
                apples2
                ) {
            System.out.println(a);
        }*/

   /*     System.out.println(getFruit("apple", 22));
        System.out.println(getFruit("orange", 23));*/

        System.out.println(getColor(144,23,33, Color::new));

    }

    public static Color getColor(Integer r, Integer g, Integer b,
            TriFunction<Integer, Integer, Integer, Color> f){
        return f.apply(r,g,b);
    }

    static Map<String, Function<Integer, Fruit>> fruits = new HashMap<>();

    static {
        fruits.put("apple", Apple::new);
        fruits.put("orange", Orange::new);
    }

    public static Fruit getFruit(String fruit, Integer weight) {
        return fruits.get(fruit)
                .apply(weight);
    }

    public static List<Apple> map(List<Integer> list, Function<Integer, Apple> func) {
        List<Apple> result = new ArrayList<>();
        for (Integer weight : list) {
            result.add(func.apply(weight));
        }
        return result;
    }

    public static List<Apple> map2(List<Integer> list, BiFunction<Integer, String, Apple> bf, String color) {
        List<Apple> result = new ArrayList<>();
        for (Integer weight : list) {
            result.add(bf.apply(weight, color));
        }
        return result;
    }

    private static class Apple implements Fruit {

        private int size;
        private String color = "";

        public Apple() {
        }

        public Apple(int size) {
            this.size = size;
        }

        public Apple(int size, String color) {
            this.size = size;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "size=" + size +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    private static class Orange implements Fruit {

        private int size;
        private String color = "";

        public Orange(int size) {
            this.size = size;
        }

        public Orange(int size, String color) {
            this.size = size;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Orange{" +
                    "size=" + size +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    private static class Color{

        private int r,g,b;

        public Color(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        @Override
        public String toString() {
            return "Color{" +
                    "r=" + r +
                    ", g=" + g +
                    ", b=" + b +
                    '}';
        }
    }

}
