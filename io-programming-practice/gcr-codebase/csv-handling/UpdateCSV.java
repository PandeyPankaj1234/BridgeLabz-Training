import java.util.*;
import java.io.*;

class UpdateCSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputFile = "C:\\Users\\panka\\OneDrive\\Desktop\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-handling\\employees3.csv";
        String outputFile = "C:\\Users\\panka\\OneDrive\\Desktop\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-handling\\employees_updated.csv";
        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            String line = br.readLine(); // header
            bw.write(line);
            bw.newLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String department = data[2];
                int salary = Integer.parseInt(data[3]);
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 10) / 100;
                }
                bw.write(data[0] + "," + data[1] + "," + department + "," + salary);
                bw.newLine();
            }
            br.close();
            bw.close();
            System.out.println("CSV file updated successfully");
        } catch (IOException e) {
            System.out.println("Error processing file");
        }
        sc.close();
    }
}
