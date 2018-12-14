import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
        List<Integer> evenNumber = numbers.stream()
                .filter(a -> a % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumber);

    }
}
