package json;
import com.google.gson.*;
import java.io.*;
import java.util.*;

public class IplCensorAnalyzer {

    static List<String> bannedWords = Arrays.asList("damn", "bad");

    public static void main(String[] args) {
        try {
            processJson();
            processCsv();
            System.out.println("Sanitized files created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void processJson() throws Exception {
        JsonArray array = JsonParser.parseReader(new FileReader("C:\\Users\\panka\\eclipse-workspace\\jsondemo\\src\\main\\java\\json\\ipl.json")).getAsJsonArray();
        JsonArray result = new JsonArray();

        for (JsonElement e : array) {
            JsonObject obj = e.getAsJsonObject();
            obj.addProperty("player", maskName(obj.get("player").getAsString()));
            obj.addProperty("comment", censorText(obj.get("comment").getAsString()));
            result.add(obj);
        }

        FileWriter writer = new FileWriter("C:\\Users\\panka\\eclipse-workspace\\jsondemo\\src\\main\\java\\json\\ipl_sanitized.json");
        writer.write(new GsonBuilder().setPrettyPrinting().create().toJson(result));
        writer.close();
    }

    static void processCsv() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\panka\\eclipse-workspace\\jsondemo\\src\\main\\java\\json\\ipl.csv"));
        FileWriter fw = new FileWriter("C:\\Users\\panka\\eclipse-workspace\\jsondemo\\src\\main\\java\\json\\ipl_sanitized.csv");

        String line;
        fw.write(br.readLine() + "\n"); // header

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            data[0] = maskName(data[0]);
            data[2] = censorText(data[2]);
            fw.write(String.join(",", data) + "\n");
        }

        br.close();
        fw.close();
    }

    static String censorText(String text) {
        for (String word : bannedWords) {
            text = text.replaceAll("(?i)" + word, "****");
        }
        return text;
    }

    static String maskName(String name) {
        String[] parts = name.split(" ");
        return parts[0].charAt(0) + "**** " + parts[1];
    }
}
