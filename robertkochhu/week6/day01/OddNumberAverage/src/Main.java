import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
        DoubleSummaryStatistics number = numbers.stream()
                .filter(a -> a % 2 == 1 || a % 2 == -1)
                .collect(Collectors.summarizingDouble(Integer::doubleValue));
        double average = number.getAverage();
        System.out.println(average);

        List<Integer> rekaLista = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
        OptionalDouble rekaLista1 = rekaLista.stream()
                .filter(a -> a % 2 == 1 || a % 2 == -1)
                .mapToDouble(a -> a)
                .average();

        System.out.println(rekaLista1);
    }
}
