package json;
import com.google.gson.Gson;
import java.util.*;

public class ListToJsonArray {

    String name;
    int age;

    ListToJsonArray(String name,int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args){
        List<ListToJsonArray> list=new ArrayList<>();
        list.add(new ListToJsonArray("Pankaj",21));
        list.add(new ListToJsonArray("Rahul",22));
        list.add(new ListToJsonArray("Aman",20));

        Gson gson=new Gson();
        String jsonArray=gson.toJson(list);

        System.out.println(jsonArray);
    }
}
