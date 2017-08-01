package numbers;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MainMakingPairs {
    public static void main(String[] args) {

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> numbers2 = Arrays.asList(3, 4);

        List<int[]> result1 = numbers1.stream()
                .flatMap(el1 -> numbers2.stream()
                        .map(el2 -> new int[] { el1, el2 }))
                .collect(toList());

        List<int[]> result2 = numbers1.stream()
                .flatMap(el1 ->
                        numbers2.stream()
                                .filter(el2 -> (el1 + el2) % 3 == 0)
                                .map(el2 -> new int[] { el1, el2 }))
                .collect(toList());

    }
}
