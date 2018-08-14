import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        String filename = "asd.txt";

        System.out.println(countLines(filename));
    }

    public static int countLines(String name) {
        int lineAmount = 0;
        try {
            Path filePath = Paths.get(name);
            List<String> lines = Files.readAllLines(filePath);
            lineAmount = lines.size();
            return lineAmount;
        } catch (Exception e) {

            return 0;
        }


    }
}
