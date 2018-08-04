import java.util.*;

public class ParametricAverage {
    public static void main(String[] args){

        double b = 0;
        System.out.println("Please, enter a number");
        Scanner scanner = new Scanner(System.in);
        int ur = scanner.nextInt();
        System.out.println("Please give me "+ ur + " numbers. ");

        for(int i = 0;i <ur;i++)
        {int a = scanner.nextInt();
        b = b + a;

        }
        System.out.println(b/ur +" is the average");
        System.out.println(b +" is the amount");

    }
}
