package json;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.util.*;

public class ReadJsonFile {
    public static void main(String[] args) {
        try {
            FileReader reader=new FileReader("C:\\Users\\panka\\eclipse-workspace\\jsondemo\\src\\main\\java\\json\\user.json");
            JsonObject jsonObject=JsonParser.parseReader(reader).getAsJsonObject();
            String name=jsonObject.get("name").getAsString();
            String email=jsonObject.get("email").getAsString();
            System.out.println("Name: "+name);
            System.out.println("Email: "+email);
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
