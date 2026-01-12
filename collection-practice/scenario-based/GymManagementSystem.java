class NotEligibleForCompetitionException extends Exception {
    NotEligibleForCompetitionException(String msg) {
        super(msg);
    }
}

interface CompetitionEligible {
    boolean checkEligibility() throws NotEligibleForCompetitionException;
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showDetails() {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }
}

class Lifter extends Person implements CompetitionEligible {
    private double bodyWeight;
    private double squatPr;
    private double benchPressPr;
    private double deadLiftPr;

    Lifter(String name, int age) {
        super(name, age);
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public void setSquatPr(double squatPr) {
        this.squatPr = squatPr;
    }

    public void setBenchPressPr(double benchPressPr) {
        this.benchPressPr = benchPressPr;
    }

    public void setDeadLiftPr(double deadLiftPr) {
        this.deadLiftPr = deadLiftPr;
    }

    public double getTotalPr() {
        return squatPr + benchPressPr + deadLiftPr;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("BodyWeight :" + bodyWeight);
        System.out.println("SquatPr :" + squatPr);
        System.out.println("BenchPressPr :" + benchPressPr);
        System.out.println("DeadLiftPr :" + deadLiftPr);
    }

    public boolean checkEligibility() throws NotEligibleForCompetitionException {
        if (getTotalPr() < 300) {
            throw new NotEligibleForCompetitionException("Total must be at least 300 kgs");
        }
        return true;
    }
}

class Coach extends Person {
    private String specialization;

    Coach(String name, int age) {
        super(name, age);
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Specialization :" + specialization);
    }
}

abstract class TrainingProgram {
    abstract double calculateWeeklyVolume();

    abstract void programType();
}

class BeginnerProgram extends TrainingProgram {
    double calculateWeeklyVolume() {
        return 15.0;
    }

    void programType() {
        System.out.print("Beginner");
    }
}

class AdvancedPowerliftingProgram extends TrainingProgram {
    double calculateWeeklyVolume() {
        return 20.0;
    }

    void programType() {
        System.out.print("Advanced");
    }
}

public class GymManagementSystem {
    public static void main(String[] args) {
        Lifter L = new Lifter("Pankaj Pandey", 22);
        L.setBodyWeight(63.0);
        L.setSquatPr(120.0);
        L.setBenchPressPr(100.0);
        L.setDeadLiftPr(140.0);

        TrainingProgram program = new BeginnerProgram();
        program.programType();
        System.out.println(" - Volume :" + program.calculateWeeklyVolume());

        program = new AdvancedPowerliftingProgram();
        program.programType();
        System.out.println(" - Volume :" + program.calculateWeeklyVolume());

        try {
            L.checkEligibility();
            System.out.println("Lifter is eligible for competition!");
        } 
        catch (NotEligibleForCompetitionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
