package zhur;

import zhur.model.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

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




}
