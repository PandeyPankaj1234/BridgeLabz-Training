import java.io.*;

class UserInfoToFile {
    public static void main(String[] args) {
        BufferedReader br = null;
        FileWriter fw = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your name: ");
            String name = br.readLine();
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(br.readLine());
            System.out.print("Enter your favorite programming language: ");
            String lang = br.readLine();
            fw = new FileWriter("user_info.txt");
            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Favorite Language: " + lang + "\n");
            System.out.println("User information saved successfully");
        } catch (IOException e) {
            System.out.println("Input/Output error occurred");
        } catch (NumberFormatException e) {
            System.out.println("Invalid age entered");
        } finally {
            try {
                if (fw != null)
                    fw.close();
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error while closing resources");
            }
        }
    }
}
