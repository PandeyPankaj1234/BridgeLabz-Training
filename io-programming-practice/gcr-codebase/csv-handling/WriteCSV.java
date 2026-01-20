import java.util.*;
import java.io.*;

class WriteCSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = "C:\\Users\\panka\\OneDrive\\Desktop\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-handling\\employees.csv";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            bw.write("ID,Name,Department,Salary");
            bw.newLine();
            bw.write("101,Pankaj,IT,45000");
            bw.newLine();
            bw.write("102,Rahul,HR,38000");
            bw.newLine();
            bw.write("103,Amit,Finance,52000");
            bw.newLine();
            bw.write("104,Suman,Marketing,40000");
            bw.newLine();
            bw.write("105,Neha,Development,60000");
            bw.newLine();
            bw.close();
            System.out.println("CSV file written successfully");
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
        sc.close();
    }
}
