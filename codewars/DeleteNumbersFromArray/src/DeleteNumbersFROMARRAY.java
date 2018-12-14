import java.util.*;

public class DeleteNumbersFROMARRAY {
    public static void main(String[] args) {
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> myMap = new HashMap<>();
        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 0; i < elements.length; i++) {
            if (!myMap.containsKey(elements[i])) {
                myMap.put(Integer.valueOf(elements[i]), 1);
            } else myMap.put(Integer.valueOf(elements[i]), myMap.get(Integer.valueOf(elements[i])) + 1);
            if (myMap.get(Integer.valueOf(elements[i])) <= maxOccurrences) {
                myList.add(elements[i]);
            }
        }
        int[] buzi = new int[myList.size()];
        for (int o = 0; o < myList.size(); o++) {
            buzi[o] = myList.get(o);
        }
        return buzi;
    }
}