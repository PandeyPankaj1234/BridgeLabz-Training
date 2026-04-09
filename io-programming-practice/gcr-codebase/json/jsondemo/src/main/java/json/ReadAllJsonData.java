package json;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.util.*;

public class ReadAllJsonData {
    public static void main(String[] args) {
        try {
            FileReader reader=new FileReader("C:\\Users\\panka\\eclipse-workspace\\jsondemo\\src\\main\\java\\json\\data.json");
            JsonObject jsonObject=JsonParser.parseReader(reader).getAsJsonObject();
            for(String key:jsonObject.keySet()){
                JsonElement value=jsonObject.get(key);
                System.out.println(key+" : "+value);
            }
            reader.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
