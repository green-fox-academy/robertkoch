import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class HappyYear {
    public static void main(String[] args) {
        int date = 1111;
        System.out.println(nextHappyYear(date));
    }

    static public int nextHappyYear(int year) {
        String yearL = Integer.toString(year);
        int finalNumber;
        String finalString = "";
        String yearLength = Integer.toString(year);
        List<String> arraylist = new ArrayList<>();
        while (arraylist.size() < yearL.length()) {
            for (int i = 0; i < yearL.length(); i++) {
                String yearString = Integer.toString(year + 1);
                if (arraylist.contains(String.valueOf(yearString.charAt(i))) != false) {
                    arraylist.add(String.valueOf(yearString.charAt(i)));
                }
                else{
                year += 1;}
            }
        }
        for (int j = 0; j < arraylist.size(); j++) {
            System.out.println(arraylist.get(j));

        }

        return 1;
    }
}



