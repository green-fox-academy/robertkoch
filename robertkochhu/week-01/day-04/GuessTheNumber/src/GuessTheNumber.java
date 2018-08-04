import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numb1 = 10;
        int u1;
        do {
            u1 = scanner.nextInt();
            if (u1 > numb1) {
                System.out.println("Your number is bigger.");
            } else if (numb1 > u1) {
                System.out.println("Your number is smaller");
            } else {
                System.out.println("You found it");
            }
        }while(u1!= numb1);







        }
    }
