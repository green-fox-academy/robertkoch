public class Anagram {
    public static void main(String[] args) {
        System.out.println(isItAnagram("dog", "god"));
    }

    public static boolean isItAnagram(String a, String b) {
        boolean ana = false;
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (b.contains(Character.toString(a.charAt(i)))) {
                ana = true;
            } else ana = false;
        }
        return ana;
    }
}
