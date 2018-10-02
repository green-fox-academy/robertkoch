import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Copy {
    public static void main(String[] args) {
        copyFiles("my-file.txt", "my-file1.txt");
    }

    public static boolean copyFiles(String original, String copy) {
        boolean isSuccesfullCopy = true;
        try {
            Path originalFile = Paths.get(original);
            Path copyFile = Paths.get(copy);
            List<String> lines = Files.readAllLines(originalFile);
            Files.write(copyFile, lines);


        } catch (IOException e) {
            isSuccesfullCopy = false;

        }
        return isSuccesfullCopy;

    }
}