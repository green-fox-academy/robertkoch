public class Main {
    public static void main(String[] args) {
        String name = "adasddXxxxxxsofsdkpx";
        System.out.println(xRemover(name));
    }

    public static String xRemover(String name) {
        if (!name.contains("x")) {
            return name;
        } else {
            return xRemover(name.replaceFirst("x", ""));
        }
    }
}
