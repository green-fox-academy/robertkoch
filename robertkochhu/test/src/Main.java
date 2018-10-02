public class Main {
    public static void main(String[] args) {
        String matrix = "ABO\r\nDER\r\nFGT";

        System.out.println(matrixConverter(matrix));
    }

    public static String[][] matrixConverter(String matrix) {
        String[] stringArray = matrix.split("\r\n");
        String[][] stringArray1 = new String[stringArray.length][stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray.length; j++) {
                stringArray1[i][j] = String.valueOf(stringArray[i].charAt(j));
            }
        }
        return stringArray1;
    }
}
