public class Reverse {
    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        int len = reversed.length() - 1;
        System.out.println();
        for (int i = len; i >= 0; i--) {
            System.out.print(reversed.charAt(i));
        }
    }
}
