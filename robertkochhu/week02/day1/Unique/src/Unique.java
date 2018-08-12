import java.util.*;

public class Unique {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 5, 8, 5, 7, 7, 9, 45, 9};
        unique1(numbers);
    }

    public static void unique1(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean isUnique = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isUnique = true;
                    break;
                }

            }
            if (isUnique == false) {
                System.out.print(a[i] + ",");
            }
        }

    }
}
