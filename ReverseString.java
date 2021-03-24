package atiAssignment;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str="";
		String revStr="";
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string :");
		str= in.nextLine();
		int len= str.length();

		for ( int i = len- 1 ; i >= 0 ; i-- ) 		//code to reverse string 
			revStr= revStr+ str.charAt(i);
		System.out.println("Reverse String is: "+revStr);

		
	}

}
