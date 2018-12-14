import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public static void main(String args[]) {
        int[] array = {13, 10, 2, 9, 5};

        System.out.println(maxGap(array));
    }

    public static int maxGap(int[] numbers) {
        int biggestGap = 0;
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length; i++) {
            if (Math.abs(numbers[i] - numbers[i - 1]) > biggestGap) {
                biggestGap = Math.abs(numbers[i] - numbers[i - 1]);
            }
        }
        return biggestGap;
    }
}