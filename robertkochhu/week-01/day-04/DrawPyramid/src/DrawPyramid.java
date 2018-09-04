import java.util.*;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int ur = scanner.nextInt();
        int space = ur -1;
        int star = 1;
        for (int i = 1; i <= ur; i++)
        {
            System.out.println();

            for (int j = 0; j <= space; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <=star; k++)
            {
                System.out.print("*");
            }

            space -=1;
            star +=2;

        }

        }}
