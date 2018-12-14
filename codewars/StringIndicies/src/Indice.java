public class Indice {
    public static void main(String[] args) {
        System.out.println(solve("(", 0));
    }

    public static int solve(String str, int index) {

        if (str.charAt(index) != '(')
            return -1;
        int indexIndex = 0;
        int counterLeft = 0;
        int counterRight = 0;
        for (int i = index; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                counterLeft++;
            }
            if (str.charAt(i) == ')') {
                counterRight++;
            }
            if (counterLeft == counterRight) {
                return i;
            }
        }
        return -1;
    }
}

