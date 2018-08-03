import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ui1 = scanner.nextInt();
        int ui2 = scanner.nextInt();
        if (ui1 >= ui2) {System.out.println("the second number should be bigger");}
        else {System.out.println(ui1);}
        while (ui1 < ui2) {ui1 +=1; System.out.println(ui1);}



    }
}

