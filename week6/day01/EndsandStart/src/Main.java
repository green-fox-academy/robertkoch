import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
        cities.stream()
                .filter(ch->ch.charAt(0)=='A'&& ch.endsWith("I"))
                .forEach(System.out::println);
    }
}
