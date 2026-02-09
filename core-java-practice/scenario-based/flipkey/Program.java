package flipkey;

import java.util.Scanner;

public class Program {
	public static String CleanseAndInvert(String input) {
		if(input==null || input.length()<6) {
			return "";
			
		}if(!input.matches("[a-zA-Z]+")) {
			return "";
		}
		input = input.toLowerCase();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if((int)ch%2!=0) {
				sb.append(ch);
				
			}
		}
		sb.reverse();
		StringBuilder result = new StringBuilder();
		for(int i=0;i<sb.length();i++) {
			char ch = sb.charAt(i);
			if(i%2==0) {
				result.append(Character.toUpperCase(ch));
			}
			else {
				result.append(ch);
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String input = sc.nextLine();
		String key = CleanseAndInvert(input);
		if(key.equals("")) {
			System.out.println("Invalid Input");
		}
		else {
			System.out.println("The generated Key is -" + key);
		}
		sc.close();
		
	}
}
