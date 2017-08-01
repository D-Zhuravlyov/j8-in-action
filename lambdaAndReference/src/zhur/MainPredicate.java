package zhur;

import zhur.model.Apple;

import java.util.function.Predicate;

public class MainPredicate {

    public static void main(String[] args) {

        Predicate<Apple> predicateRedAp = apple ->"red".equals(apple.getColor());

        Predicate<Apple> predicateNotRedAp = predicateRedAp.negate();

        Apple greenApple = new Apple(22,"green");
        Apple redApple = new Apple(33,"red");

        System.out.println("Red, true: "+ predicateRedAp.test(redApple));
        System.out.println("Green, false: " + predicateNotRedAp.test(greenApple));


        Predicate<Apple> predicateRedAndLess20 = predicateRedAp.and(apple -> apple.getSize() < 20);
        System.out.println("33 red, less than 20 and red, false: " +predicateRedAndLess20.test(redApple));


    }
}
