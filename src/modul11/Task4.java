package modul11;

import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(checkWord("C:\\Users\\Lenovo\\IdeaProjects\\JavaGoItCore\\src\\modul11\\task4.txt", "task"));
    }

    private static int checkWord(String filePath, String word) {
        Map<String, String> map = new HashMap<>();
        map.put("", "");
        String string = Task1.replacer(map, filePath);
        int result = 0;
        for (String str : string.split(" ")) {
            if (str.contains(word)) {
                result++;
            }
        }
        return result;
    }
}
