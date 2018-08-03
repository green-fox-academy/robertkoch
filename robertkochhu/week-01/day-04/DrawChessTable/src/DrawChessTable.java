public class DrawChessTable {
    public static void main(String[] args) {


        String lineOne = "% % % % ";
        String lineTwo = " % % % %";
        for (int a = 1; a <= 8; a += 2) {
            System.out.println(lineOne);
            int c = 0;
            c += 2;

            for (int b = 2; b <= c; b += 2) {
                System.out.println(lineTwo);


            }
        }

    }
}
