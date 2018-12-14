import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
        List<Double> poweredNumbers = numbers.stream()
                .mapToDouble(a -> a)
                .boxed()
                .filter(a -> a > 0)
                .map(a -> Math.pow(a, 2.0))
                .collect(Collectors.toList());
        System.out.println(poweredNumbers);
    }
}
