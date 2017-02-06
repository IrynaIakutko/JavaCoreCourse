package modul11;

import java.io.*;;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaIO {
    public String replacer(Map<String, String> map) {
        String replace = readStringFromFile("d:/dz.txt");

        for (Map.Entry<String, String> stringEntry : map.entrySet()) {
            replace = replace.replace(stringEntry.getKey(), stringEntry.getValue());
        }
        return replace;
    }

    public String readStringFromFile(String fileName) {
        StringBuilder stringBuilder = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            stringBuilder = new StringBuilder();
            String str = null;
            while ((str = reader.readLine()) != null) {
                stringBuilder.append(str + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
