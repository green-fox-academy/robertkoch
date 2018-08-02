import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        int userInput3 = scanner.nextInt();
        int userInput4 = scanner.nextInt();
        int userInput5 = scanner.nextInt();
        int sum = userInput1 + userInput3 + userInput2 + userInput4 + userInput5;
        double avg = (userInput1 + userInput3 + userInput2 + userInput4 + userInput5)/5;
        System.out.println(sum + " az osszeg " + avg + " az atlag");


    }
}
