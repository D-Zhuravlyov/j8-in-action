package impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorBasedRef {


    public static List<Apple> map(List<Integer> list, Function<Integer, Apple> func){
        List<Apple> result = new ArrayList<>();
        for (Integer weight: list) {
           result.add(func.apply(weight));
        }
        return result;
    }

    public static List<Apple> map2(List<Integer> list, BiFunction<Integer, String, Apple> bf, String color) {
        List<Apple> result = new ArrayList<>();
        for (Integer weight: list) {
            result.add(bf.apply(weight, color));
        }
        return result;
    }

    public static void main(String[] args) {
        Supplier<Apple> s1 = Apple::new;
        Apple appleFromRef = s1.get();

        Function<Integer, Apple> s2 = Apple::new;
        Apple appleFromRefInt = s2.apply(22);

        System.out.println(appleFromRef);
        System.out.println(appleFromRefInt);


        List<Integer> weights = Arrays.asList(3,4,5,6,12,6);
        List<Apple> apples = map(weights, Apple::new);

        List<Apple> apples2 = map2(weights, Apple::new, "red");

        System.out.println("MAP: ");
        for (Apple a:
                apples
             ) {
            System.out.println(a);
        }

   System.out.println("MAP2: ");
        for (Apple a:
                apples2
             ) {
            System.out.println(a);
        }

    }

    private static class Apple{

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

}
