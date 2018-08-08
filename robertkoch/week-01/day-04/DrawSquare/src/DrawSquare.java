import java.util.*;

public class DrawSquare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int ur = scanner.nextInt();

        for (int i = 0; i <= ur; i++) {
            for (int j = 0; j <= ur; j++) {
                if(i==0 || j==0 || i ==ur || j==ur){
                    System.out.print("*");

                                                    }
                else {System.out.print(" ");
                    }


        }
        System.out.println();
    }
}}
