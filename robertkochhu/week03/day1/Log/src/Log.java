import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Log {
    public static void main(String[] args) {
        List<String> content = new ArrayList();
        try {
            Path logPlace = Paths.get("https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/file-manipulations/logs/log.txt");
            List<String> lines = Files.readAllLines(logPlace);

            for (int i = 0; logPlace.)


        } catch (IOException e) {

        }
    }
}
