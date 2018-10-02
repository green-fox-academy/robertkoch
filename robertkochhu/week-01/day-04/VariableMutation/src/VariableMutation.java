public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        double e = 8;
        double cube = Math.pow(e, 3);
        System.out.println(cube);

        int f1 = 123;
        int f2 = 345;
        boolean bol1 = 123 > 345;
        System.out.println(bol1);

        int g1 = 350;
        int g2 = 200;
        boolean bol22 = g2 * 2 > g1;
        System.out.println(bol22);

        int h = 135798745;
        boolean bo33 = 135798745 % 11 == 0;
        System.out.println(bo33);

        int i1 = 10;
        int i2 = 3;
        boolean d44 = i2 * i2 < i1 && i1 < i2 * i2 * i2;
        System.out.println(d44);

        int j = 1521;
        boolean e5 = j % 5 == 0 || j % 3 == 0;
        System.out.println(e5);

        String k = "Apple";
        System.out.println(k + k + k + k);


    }

}
