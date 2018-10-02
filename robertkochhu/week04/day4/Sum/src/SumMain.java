import java.util.ArrayList;

public class SumMain {
    ArrayList<Integer> list = new ArrayList<Integer>();


    public int sumList(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
