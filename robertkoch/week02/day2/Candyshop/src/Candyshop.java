import java.util.*;

public class Candyshop {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);
        System.out.println(onlyString(arrayList));
    }

    public static ArrayList<Object> onlyString(ArrayList<Object> only) {

        only.set(1, "Croissant");
        only.set(3, "Ice cream");
        return only;
    }

}
