public class Main {
    public static void main(String[] args) {
        String pali = "horux";
        System.out.println(createpalindrome(pali));
    }

    public static String createpalindrome(String a) {
        String temp = a;
        for (int i = a.length(); i > 0; i--) {
            temp = temp + a.charAt(i - 1);


        }
        return temp;
    }
}
