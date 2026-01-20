import java.util.*;
import java.io.*;

class SearchEmployeeCSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name to search: ");
        String searchName = sc.nextLine();
        String filePath = "C:\\Users\\panka\\OneDrive\\Desktop\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-handling\\employees2.csv";
        boolean found = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[1];
                if (name.equalsIgnoreCase(searchName)) {
                    String department = data[2];
                    int salary = Integer.parseInt(data[3]);
                    System.out.println("Employee Found");
                    System.out.println("Department: " + department);
                    System.out.println("Salary: " + salary);
                    found = true;
                    break;
                }
            }
            br.close();
            if (!found) {
                System.out.println("Employee not found");
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        sc.close();
    }
}
