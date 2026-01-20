import java.util.*;
import java.io.*;

class FilterCSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = "C:\\Users\\panka\\OneDrive\\Desktop\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-handling\\students2.csv";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int marks = Integer.parseInt(data[3]);
                if (marks > 80) {
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    int age = Integer.parseInt(data[2]);
                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Marks: " + marks);
                    System.out.println("--------------------");
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        sc.close();
    }
}
