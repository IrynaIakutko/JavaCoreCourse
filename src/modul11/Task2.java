package modul11;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("old", "new");

        fileContentReplacer(map, "C:\\Users\\Lenovo\\IdeaProjects\\JavaGoItCore\\src\\modul11\\Task2.txt");

    }

    private static File fileContentReplacer(Map<String, String> map, String filePath) {
        String newString = Task1.replacer(map, filePath);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(filePath)))) {
            bufferedWriter.write(newString);
        } catch (IOException e) {
            System.err.println("File error");
        }
        return new File(filePath);
    }
}
