import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class MultipleLine {
    public static void main(String[] args) {
        String filePath = "my-file.txt";
        String myName = "asdasdas";
        int myNumber = 7;
        myMultiWriter(filePath, myName, myNumber);
    }

    public static void myMultiWriter(String path, String name, int number) {
        List<String> content = new ArrayList();
        for (int i = 0; i < number; i++) {
            content.add(name);
        }

        try {
            Path filePath = Paths.get(path);
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println(" no file");


        }
    }
}
