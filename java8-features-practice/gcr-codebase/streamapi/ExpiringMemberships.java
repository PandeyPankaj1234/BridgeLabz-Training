package streamapi;

import java.util.*;
import java.time.*;

class Member{
    String name;
    LocalDate expiryDate;
    Member(String name,LocalDate expiryDate){
        this.name=name;
        this.expiryDate=expiryDate;
    }
    public LocalDate getExpiryDate(){
        return expiryDate;
    }
    public String toString(){
        return name+" | Expiry Date: "+expiryDate;
    }
}

public class ExpiringMemberships{
    public static void main(String[] args){
        List<Member> members=Arrays.asList(
            new Member("Amit",LocalDate.now().plusDays(10)),
            new Member("Ravi",LocalDate.now().plusDays(45)),
            new Member("Neha",LocalDate.now().plusDays(25)),
            new Member("Pooja",LocalDate.now().plusDays(5)),
            new Member("Rahul",LocalDate.now().plusDays(60))
        );

        LocalDate today=LocalDate.now();
        LocalDate next30Days=today.plusDays(30);

        members.stream()
               .filter(m->!m.getExpiryDate().isBefore(today)
                       && !m.getExpiryDate().isAfter(next30Days))
               .forEach(System.out::println);
    }
}

