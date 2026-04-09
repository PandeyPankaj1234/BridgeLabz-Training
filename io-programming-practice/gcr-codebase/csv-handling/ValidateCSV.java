import java.util.*;
import java.io.*;
import java.util.regex.*;

class ValidateCSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = "C:\\Users\\panka\\OneDrive\\Desktop\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-handling\\users.csv";
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String email = data[2];
                String phone = data[3];
                boolean valid = true;
                String error = "";
                if (!emailPattern.matcher(email).matches()) {
                    valid = false;
                    error += "Invalid Email ";
                }
                if (!phone.matches("\\d{10}")) {
                    valid = false;
                    error += "Invalid Phone ";
                }
                if (!valid) {
                    System.out.println("Invalid Row: " + line);
                    System.out.println("Error: " + error);
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
