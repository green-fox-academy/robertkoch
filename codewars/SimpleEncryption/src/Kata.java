public class Kata {
    public static void main(String[] args) {
        String text = "This is a test!";
        final int n = 1;
        System.out.println(encrypt(text, n));
        System.out.println(decrypt(text, n));


    }

    public static String encrypt(final String text, final int n) {
        String encryptedText = "";
        String temporary = text;
        if (text == "") {
            return "";
        }
        if (n <= 0) {
            return text;
        }
        for (int k = 1; k <= n; k++) {

            for (int i = 1; i < text.length(); i = i + 2) {
                encryptedText = encryptedText + temporary.charAt(i);
            }
            for (int j = 0; j < text.length(); j += 2) {
                encryptedText = encryptedText + temporary.charAt(j);
            }
            temporary = encryptedText.substring((k - 1) * text.length());

        }
        return encryptedText.substring((n - 1) * text.length());
    }

    public static String decrypt(final String encryptedText, final int n) {
        String decryptedText = "";
        String temporary = encryptedText;
        for (int k = 1; k <= n; k++) {

            for (int i = encryptedText.length() - 1; i > 0; i = i - 2) {
                decryptedText = encryptedText + temporary.charAt(i);
            }
            for (int j = encryptedText.length() - 1; j > 0; j = -2) {
                decryptedText = encryptedText + temporary.charAt(j);
            }
            temporary = encryptedText.substring((k - 1) * encryptedText.length());

        }
        return encryptedText.substring((n - 1) * encryptedText.length());

    }

}