public class Main {
    public static void main(String[] args) {
        String name = "xXadxsADAdAdasadfasdxs";
        System.out.println(changeXtoY(name));
    }

    public static String changeXtoY(String name) {
        if (!name.contains("x")) {
            return name;

        } else {

            return changeXtoY(name.replaceFirst("x", "y"));


        }

    }
}
