package exercise1;

import java.util.Scanner;

public class password {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("insert pw: ");
		System.out.println(checkPassword(scan.next().toString()));
	}
	//minimum of 8 char and 21 max
	//must be caps first letter
	//accepts any case of letter and numbers in the middle/last
	//do not accept symbols
	public static boolean checkPassword(String userinput) {
		String regex = "^[A-Z]([a-zA-Z0-9]){7,20}";
		
		return userinput.matches(regex);
	}
	
}
