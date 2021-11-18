package string;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverse(String s) {
		if(s.isEmpty())
			return s;
		return reverse(s.substring(1)) + s.charAt(0);
	}
	
	public static void main(String args[]) {
		String str;
		System.out.println("Enter a string");
		Scanner scanner = new Scanner(System.in);
		str= scanner.nextLine();
		scanner.close();
		String rev = reverse(str);
		System.out.println(rev);
	}
}
