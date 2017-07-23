package com.zhur;

import com.zhur.model.Apple;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import static com.zhur.ConstructorBasedRef.map;
import static com.zhur.ConstructorBasedRef.map2;

public class MainCreateByRef {


    public static void main(String[] args) {

        Supplier<Apple> s1 = Apple::new;
        Apple appleFromRef = s1.get();

        Function<Integer,Apple> s2 = Apple::new;
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
}
