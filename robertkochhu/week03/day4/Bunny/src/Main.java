public class Main {
    public static void main(String[] args) {
        int bunnies = 100;

        System.out.println(earCounter(bunnies));
    }

    public static int earCounter(int bunnies) {
        if(bunnies ==1){
            return 2;
        }
        else{
            int bunnyEars = earCounter(bunnies-1)+2;
            return bunnyEars;
        }

    }
}
