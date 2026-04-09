package json;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.*;

public class MergeJsonObjects {
    public static void main(String[] args) {

        JsonObject json1=new JsonObject();
        json1.addProperty("name","Pankaj");
        json1.addProperty("email","pankaj@gmail.com");

        JsonObject json2=new JsonObject();
        json2.addProperty("age",21);
        json2.addProperty("city","Mathura");

        for(String key:json2.keySet()){
            JsonElement value=json2.get(key);
            json1.add(key,value);
        }

        System.out.println(json1);
    }
}
