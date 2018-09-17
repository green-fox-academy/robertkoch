public class Troll {
    public static String disemvowel(String str) {
        String NoWowel = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                NoWowel = NoWowel + "";
            } else {
                NoWowel = NoWowel + str.charAt(i);
            }

        }
        return NoWowel;
    }
}