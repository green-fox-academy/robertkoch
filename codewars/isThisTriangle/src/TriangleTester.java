class TriangleTester {
    public static void main(String args[]) {
        int a = 7;
        int b = 2;
        int c = 2;
        System.out.println(isTriangle(a, b, c));
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b) {
            return true;
        } else return false;
    }
}