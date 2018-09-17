import java.util.*;

public class DescendingOrder {
    public static void main(String[] args) {
    }

    public static int sortDesc(final int num) {
        String number = Integer.toString(num);
        char[] numberList = number.toCharArray();
        Arrays.sort(numberList);
        char[] reversedNumberList = new char[numberList.length];
        for (int i = 0; i < numberList.length; i++) {
            reversedNumberList[i] = numberList[numberList.length - 1 - i];
        }
        int descendedNumber = Integer.parseInt(new String(reversedNumberList));
        return descendedNumber;
    }
}