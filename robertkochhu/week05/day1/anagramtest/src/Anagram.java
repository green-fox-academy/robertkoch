import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static boolean IsAnagram(String name1, String name2) {
        name1=name1.toLowerCase();
        name2=name2.toLowerCase();
        char[] list1 = name1.replaceAll("[\\s]", "").toCharArray();

        char[] list2 = name2.replaceAll("[\\s]", "").toCharArray();

        Arrays.sort(list1);
        Arrays.sort(list2);

        if (Arrays.equals(list1,list2)) {
            return true;
        } else {
            return false;
        }




    }
}
