import java.util.*;
import java.io.*;

class Student {
    private int id;
    private String name;
    private int age;
    private int marks;

    Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String toString() {
        return "ID:" + id + " Name:" + name + " Age:" + age + " Marks:" + marks;
    }
}

class CSVToObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = "C:\\Users\\panka\\OneDrive\\Desktop\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-handling\\students4.csv";
        List<Student> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);
                list.add(new Student(id, name, age, marks));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        for (Student s : list) {
            System.out.println(s);
        }
        sc.close();
    }
}
