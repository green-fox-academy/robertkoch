public class urlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("bots","odds.com");
        url = url.substring(0,5)+":"+url.substring(5,url.length());

        System.out.println(url);

    }
}
