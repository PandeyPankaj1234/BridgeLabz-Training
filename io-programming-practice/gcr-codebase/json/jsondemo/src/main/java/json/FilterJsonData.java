package json;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.util.*;

public class FilterJsonData {
    public static void main(String[] args) {
        try {
            FileReader reader=new FileReader("C:\\Users\\panka\\eclipse-workspace\\jsondemo\\src\\main\\java\\json\\users.json");
            JsonArray jsonArray=JsonParser.parseReader(reader).getAsJsonArray();

            for(int i=0;i<jsonArray.size();i++){
                JsonObject user=jsonArray.get(i).getAsJsonObject();
                int age=user.get("age").getAsInt();
                if(age>25){
                    System.out.println(user);
                }
            }
            reader.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
