import java.util.*;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        divider(userInput);
    }

    public static void divider(int userInputNumber) {


        try {
            int result = 10/userInputNumber;
            System.out.println(result);
        } catch (
                ArithmeticException e) {
            System.out.println("Cant divide with 0");
        }
    }
}

