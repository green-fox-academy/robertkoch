import java.util.*;

public class Takeslonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String quote1 = "always takes longer than";
        StringBuilder sb = new StringBuilder(quote);
        StringBuilder quote3 = sb.insert(20, quote1);
        System.out.println(quote3);


    }
}
