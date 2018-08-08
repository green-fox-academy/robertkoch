public class urlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("bots","odds.com");

        System.out.println(url);

    }
}
