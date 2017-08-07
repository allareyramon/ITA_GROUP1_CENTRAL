package com.oocl.ita.day6;

import java.util.Scanner;
import java.util.regex.*;

public class Regexsample {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter desired password");
		String a = in.nextLine().toLowerCase();

		if(a.matches(".*[a-z]")) {
			System.out.println("Password is ok!~");
		}else{
			System.out.println("Password must have letters and numbers");
		}
		
	}

}
