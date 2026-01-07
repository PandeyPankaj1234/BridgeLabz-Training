import java.util.*;
import java.io.*;

class FileCopy {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("C:\\Users\\panka\\OneDrive\\Desktop\\BridgeLabz-Training\\collection-practice\\gcr-codebase\\java-streams\\Source.txt");
            fos = new FileOutputStream("C:\\Users\\panka\\OneDrive\\Desktop\\BridgeLabz-Training\\collection-practice\\gcr-codebase\\java-streams\\Destination.txt");
            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }
            System.out.println("File copied successfully");
        } catch (FileNotFoundException e) {
            System.out.println("Source file does not exist");
        } catch (IOException e) {
            System.out.println("Error while reading or writing file");
        } finally {
            try {
                if (fis != null)
                    fis.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println("Error while closing file");
            }
        }
    }
}
