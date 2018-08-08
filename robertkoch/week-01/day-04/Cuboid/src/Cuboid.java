public class Cuboid {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        int surface = 2 * a * b + 2 * a *c + 2 * b *c;
        int volume = a* b * c;
        System.out.println("Surface area : " + surface);
        System.out.println("Volume : " + volume);
    }
}
