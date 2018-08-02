public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int totalSeconds = 60*60*24;
        int goneSecond = 42 + 34 * 60 + 14 * 60 *60;
        System.out.println(totalSeconds - goneSecond);
    }
}
