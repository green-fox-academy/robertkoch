public class main {
    public static void main(String[] args) {

        wave("hel  o");
    }
    public static String[] wave(String str) {
        String copy = str;
        int letterCount = copy.replaceAll(" ", "").length();
        String[] array = new String[letterCount];
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                counter++;
                continue;
            } else {
                array[i - counter] = str.substring(0, i).toLowerCase() + str.substring(i, i + 1).toUpperCase() + str.substring(i + 1).toLowerCase();
            }
        }
        return array;
    }
}
