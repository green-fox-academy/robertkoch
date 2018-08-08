public class PrintParams {
    public static void main(String[] args) {

        printParams("first");
        printParams("first", "second");
        printParams("first", "second", "third", "fourh");

    }

    public static void printParams(String... args) {
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }
}
