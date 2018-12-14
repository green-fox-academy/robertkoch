import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class katas {
    public static void main(String[] args) {
    }

    public static String abbrevName(String name) {
        String[] array = name.split(" ");
        String abb = "";
        abb = array[0].substring(1).toUpperCase() + "." + array[1].substring(1).toUpperCase();
        return abb;
    }


    public static int betweenExtremes(int[] numbers) {
        int smallest = numbers[0];
        int biggest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
            if (biggest < numbers[i]) {
                biggest = numbers[i];
            }
        }
        return biggest - smallest;
    }

    public static int[] map(int[] arr) {
        int[] map1 = Arrays.stream(arr).map(x -> x * 2).toArray();

        return map1;
    }

    public static int[] flattenAndSort(int[][] array) {
        ArrayList<Integer> newOne = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newOne.add(array[i][j]);
            }
        }
        int[] back = new int[newOne.size()];
        Collections.sort(newOne);
        for (int i = 0; i < newOne.size(); i++) {
            back[i] = newOne.get(i);
        }

        return back;
    }

    public static int diagonalSum(final int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static double find_average(int[] array) {
        return Arrays.stream(array).sum() / array.length;
    }

}
