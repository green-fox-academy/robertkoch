import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String s ="asdfjasdfasdfasdfasdfdfsa";
        Map<String,Long> charMap=s.chars()
                .collect(Collectors.groupingBy(ch->))

    }
}
