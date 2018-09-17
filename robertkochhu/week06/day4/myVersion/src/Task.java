import java.util.ArrayList;
import java.util.List;

public class Task {
    Tasks tasks = new Tasks();
    private ArrayList<Tasks> tasksArray = new ArrayList<>();

    public static void printOptions() {
        StringBuilder options = new StringBuilder();
        options.append("Command Line Todo application").append("\n");
        options.append("=============================").append("\n");
        ;
        options.append("                             ").append("\n");
        ;
        options.append("Command line arguments:").append("\n");
        ;
        options.append("-l   Lists all the tasks").append("\n");
        ;
        options.append("-a   Adds a new task").append("\n");
        ;
        options.append("-r   Removes an task").append("\n");
        ;
        options.append("-c   Completes an task").append("\n");
        ;
        System.out.println(options);
    }

    public static void listTasks() {

    }

    public static void argsFunction(String[] args) {
        if (args.length < 1) {
            printOptions();
            return;
        }
    }

    public void printListElements() {
        for (Tasks task : tasksArray) {

        }
    }
}
