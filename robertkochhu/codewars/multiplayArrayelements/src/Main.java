public class Main {
    public static void main(String[] args) {
        int[] array = {-23, 4, -5, 99, -27, 329, -2, 7, -921};
        System.out.println(adjacentElementsProduct(array));
    }

    public static int adjacentElementsProduct(int[] array) {
        int biggestNumber = array[0] * array[1];
        for (int i = 1; i < array.length; i++) {
            if (array[i] * array[i - 1] > biggestNumber) {
                biggestNumber = array[i] * array[i - 1];
            }
        }
        return biggestNumber;
    }
}