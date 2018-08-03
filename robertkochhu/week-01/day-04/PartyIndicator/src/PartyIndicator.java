import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boys = scanner.nextInt();
        int girls = scanner.nextInt();
    if (boys/girls == 1 && boys+girls >= 20) {System.out.println("The party is excellent!");}
    else if (boys+girls < 20) {System.out.println("avarage party");}
    else if (girls == 0) {System.out.println("Sausage party");}
    else if (boys/girls !=1 && boys+girls>20) {System.out.println("Quite a cool party");}

    }

}


