package numbers;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MainFindSquaresOfNumbers {
    public static void main(String[] args) {

       List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        numbers.stream()
                .map(n -> n * n)
                .collect(toList())
                .forEach(System.out::println);
    }
}
