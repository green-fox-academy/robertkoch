import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String blabla ="sdjkfgahphpéIOSApshaÉSUHÉIAshé";
        String[] blablaArray = blabla.split("//|");

        String[] finals=Arrays.stream(blablaArray)
                .map(c->c.charAt(0))
                .filter(Character::isUpperCase)
                .map(c->Character.toString(c))
                .toArray(String[]::new);

        System.out.println(Arrays.toString(finals));
    }
}
