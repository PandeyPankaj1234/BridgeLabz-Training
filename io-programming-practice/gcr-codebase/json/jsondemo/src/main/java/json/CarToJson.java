package json;
import com.google.gson.Gson;
import java.util.*;

public class CarToJson {
    String brand;
    String model;
    int year;

    CarToJson(String brand,String model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }

    public static void main(String[] args){
        CarToJson car=new CarToJson("Toyota","Fortuner",2022);
        Gson gson=new Gson();
        String json=gson.toJson(car);
        System.out.println(json);
    }
}

