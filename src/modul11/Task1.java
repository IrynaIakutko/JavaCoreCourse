package modul11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("old", "new");

        System.out.println(replacer(map, "C:\\Users\\Lenovo\\IdeaProjects\\JavaGoItCore\\src\\modul11\\Task1.txt"));
    }

    public static String replacer(Map<String, String> map, String filePath) {
        String result = "";
        try (BufferedReader bufferedReader = new BufferedReader
                (new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String key = new ArrayList<String>(map.keySet()).get(0);
                if (line.contains(key)) {
                    line = line.replaceAll(key, map.get(key));
                }
                result = result + line + System.getProperty("line.separator");
            }
        } catch (IOException e) {
            System.err.println("File error");
        }
        return result;
    }
}
