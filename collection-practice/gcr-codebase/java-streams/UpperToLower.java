import java.util.*;
import java.io.*;

class UpperToLower {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\panka\\OneDrive\\Desktop\\BridgeLabz-Training\\collection-practice\\gcr-codebase\\java-streams\\input.txt"));
            bw = new BufferedWriter(new FileWriter("C:\\Users\\panka\\OneDrive\\Desktop\\BridgeLabz-Training\\collection-practice\\gcr-codebase\\java-streams\\output.txt"));
            int ch;
            while ((ch = br.read()) != -1) {
                bw.write(Character.toLowerCase((char) ch));
            }
            System.out.println("File converted successfully");
        } catch (IOException e) {
            System.out.println("File read/write error");
        } finally {
            try {
                if (br != null)
                    br.close();
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                System.out.println("Error while closing resources");
            }
        }
    }
}
