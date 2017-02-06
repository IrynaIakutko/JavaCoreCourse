package modul11;
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("old", "new");

        fileContentMerger(map, "C:\\Users\\Lenovo\\IdeaProjects\\JavaGoItCore\\src\\modul11\\task3.txt");
    }

    private static File fileContentMerger(Map<String, String> map, String filePath) {
        String newString = Task1.replacer(map, filePath);
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\JavaGoItCore\\src\\modul11\\task3AfterMerge.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             PrintWriter out = new PrintWriter(bufferedWriter)) {

            out.println(newString);
        } catch (IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return new File(filePath);
    }
}
