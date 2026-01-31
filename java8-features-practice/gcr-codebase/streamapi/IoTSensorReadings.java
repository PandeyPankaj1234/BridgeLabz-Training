package streamapi;

import java.util.*;

public class IoTSensorReadings{
    public static void main(String[] args){
        List<Double> readings=Arrays.asList(
            22.5,
            35.2,
            18.9,
            40.7,
            27.3
        );

        double threshold=30.0;

        readings.stream()
                .filter(r->r>threshold)
                .forEach(r->
                    System.out.println("Alert! High Reading: "+r)
                );
    }
}
