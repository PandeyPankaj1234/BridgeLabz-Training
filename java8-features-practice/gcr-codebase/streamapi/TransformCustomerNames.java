package streamapi;

import java.util.*;

public class TransformCustomerNames{
    public static void main(String[] args){
        List<String> names=Arrays.asList(
            "rahul",
            "amit",
            "neha",
            "pooja",
            "vikas"
        );

        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}

