import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ur = scanner.nextInt();
        String elem ="&";
        String ures = " ";
        int j = 1;
        for (int i=1; i<=ur; i++) {
            if (i > j) {
                System.out.print(ures);
                System.out.println();
                for (j = 1; j <= ur; j++) {
                    System.out.print(elem);
                }

            }


        }}

}

