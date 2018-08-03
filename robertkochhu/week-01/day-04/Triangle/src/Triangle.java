import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ui = scanner.nextInt();



        int i = 1;
        int j = 1;
        int max = 1;
        for(i=1; i<=ui; i++)
        {
            System.out.println();
            for(j=1;j<=max; j++){
                System.out.print("*");}
                max++;

        }

    }}
