package streamapi;

import java.util.*;
import java.util.stream.*;

class Claim{
    String claimType;
    double amount;
    Claim(String claimType,double amount){
        this.claimType=claimType;
        this.amount=amount;
    }
    public String getClaimType(){
        return claimType;
    }
    public double getAmount(){
        return amount;
    }
}

public class InsuranceClaimAnalysis{
    public static void main(String[] args){
        List<Claim> claims=Arrays.asList(
            new Claim("Health",50000),
            new Claim("Vehicle",30000),
            new Claim("Health",70000),
            new Claim("Home",40000),
            new Claim("Vehicle",50000),
            new Claim("Health",60000)
        );

        Map<String,Double> avgClaimAmount=
            claims.stream()
                  .collect(Collectors.groupingBy(
                      Claim::getClaimType,
                      Collectors.averagingDouble(Claim::getAmount)
                  ));

        avgClaimAmount.forEach((type,avg)->
            System.out.println(type+" Average Claim: "+avg)
        );
    }
}

