import java.util.*;

public class Solyarsystem {
    public static void main(String[] args){
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));


        ArrayList<String> lista= new ArrayList<String>();
        ArrayList<String> lista2 =putSaturn(planetList);
        System.out.println(lista2);

    }

    public static ArrayList<String> putSaturn(ArrayList<String> lista){
        lista.add(7,"Saturn");
        return lista;

    }




}
