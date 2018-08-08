import java.util.*;

public class Matchmaking {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));
        System.out.println(matchMakingSystem(girls,boys));
    }

    public static ArrayList<String> matchMakingSystem(ArrayList<String> lista1, ArrayList<String> lista2) {
        ArrayList<String> commonList = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            commonList.add(lista1.get(i));
            commonList.add(lista2.get(i));
        }
        return commonList;

    }


}

