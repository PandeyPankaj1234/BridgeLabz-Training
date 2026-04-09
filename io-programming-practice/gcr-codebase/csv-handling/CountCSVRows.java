import java.util.*;
import java.io.*;

class CountCSVRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = "C:\\Users\\panka\\OneDrive\\Desktop\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-handling\\students3.csv";
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            br.readLine(); // skip header
            while (br.readLine() != null) {
                count++;
            }
            br.close();
            System.out.println("Total records: " + count);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        sc.close();
    }
}
