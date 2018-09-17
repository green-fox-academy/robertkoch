import java.util.Arrays;

class Solution {
    static int stray(int[] numbers) {

        for (int i = 0; i < numbers.length-1; i++) {
            Arrays.sort(numbers);
            if (numbers[i] != numbers[i + 1]) {
                return numbers[i];
            }
            else return numbers[numbers.length - 1];
            }
        return 0;
    }
}