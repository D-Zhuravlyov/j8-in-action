package getPrevMax;

import java.util.Arrays;

public class GetPrevMaxTest {

    private static Integer max = 0;

    public static void main(String[] args) {

        Integer[] mas = new Integer[] { 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 5, 4, 3, 2, 1, 8, 10, 9, 22, 11, 6 };
        Integer[] mas2 = new Integer[] { 0 };
        Integer[] mas3 = new Integer[] {  };
        System.out.println(getPrevMaxWithStream(mas));
        System.out.println(getPrevMaxWithStream(mas2));
        System.out.println(getPrevMaxWithStream(mas3));

    }

    static Integer getPrevMaxWithStream(Integer[] args) {

        if(args.length == 1) return -1;

        return Arrays.stream(args)
                .reduce(GetPrevMaxTest::getPrevMax).orElse(-1);
    }

    public static Integer getPrevMax(Integer prevmax, Integer current) {
        if (current < max) {
            if (current > prevmax) {
                prevmax = current;
                return prevmax;
            }
        }
        GetPrevMaxTest.max = current;
        return prevmax;

    }

}
