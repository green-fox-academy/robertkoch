public class Main {
    public static void main(String[] args){
        String name = "asdasdasdasdasdasdas";
        System.out.println(Separator(name));
    }
    public static String Separator(String name){
        int wordWithStars = name.length()-1;
        if (name.length()==wordWithStars){
            return name;
        }
        int i =1;
        return Separator(name.substring(i));
    }
}
