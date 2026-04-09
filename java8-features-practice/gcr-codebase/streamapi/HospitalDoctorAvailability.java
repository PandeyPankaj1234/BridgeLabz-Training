package streamapi;

import java.util.*;

class Doctor{
    String name;
    String specialty;
    boolean availableOnWeekend;
    Doctor(String name,String specialty,boolean availableOnWeekend){
        this.name=name;
        this.specialty=specialty;
        this.availableOnWeekend=availableOnWeekend;
    }
    public boolean isAvailableOnWeekend(){
        return availableOnWeekend;
    }
    public String getSpecialty(){
        return specialty;
    }
    public String toString(){
        return name+" | "+specialty+" | Weekend Available: "+availableOnWeekend;
    }
}

public class HospitalDoctorAvailability{
    public static void main(String[] args){
        List<Doctor> doctors=Arrays.asList(
            new Doctor("Dr. Sharma","Cardiology",true),
            new Doctor("Dr. Mehta","Orthopedics",false),
            new Doctor("Dr. Verma","Neurology",true),
            new Doctor("Dr. Singh","Dermatology",true),
            new Doctor("Dr. Gupta","Pediatrics",false)
        );

        doctors.stream()
               .filter(d->d.isAvailableOnWeekend())
               .sorted(Comparator.comparing(Doctor::getSpecialty))
               .forEach(System.out::println);
    }
}
