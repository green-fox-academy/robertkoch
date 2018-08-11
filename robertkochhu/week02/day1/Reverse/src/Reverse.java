public class Reverse {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        int[] ak = aj.clone();
        for (int i = 0; i < ak.length; i++) {
            aj[i] = ak[ak.length - i-1];

        }
        for (int j = 0; j < aj.length; j++) {
            System.out.println(aj[j]);
        }
    }
}
