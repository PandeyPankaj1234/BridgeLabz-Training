package json;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.util.*;

public class MergeJsonFiles {
    public static void main(String[] args) {
        try {
            JsonObject json1 = JsonParser.parseReader(new FileReader("C:\\Users\\panka\\eclipse-workspace\\jsondemo\\src\\main\\java\\json\\file1.json")).getAsJsonObject();
            JsonObject json2 = JsonParser.parseReader(new FileReader("C:\\Users\\panka\\eclipse-workspace\\jsondemo\\src\\main\\java\\json\\file2.json")).getAsJsonObject();

            for(String key : json2.keySet()){
                JsonElement value = json2.get(key);
                json1.add(key, value);
            }

            System.out.println(json1);

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
