import java.util.*;

public class AppendLetter {
    public static void main(String[] args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        System.out.println(appendA(far));
    }
    public static ArrayList<String> appendA(List<String> Alist){
        ArrayList<String> forA = new ArrayList<>();
        for(int i =0; i<5;i++){
            forA.add(Alist.get(i)+"a");
        }
        return forA;
    }
}
