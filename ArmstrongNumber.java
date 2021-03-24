package atiAssignment;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the 3-digit number: "); 
			int num=scan.nextInt(); 
			boolean result=result(num); 
			//System.out.println("Answer: "+result);
		} 
	}
	 public static boolean result(int a) 
	    { 
	        int sum=0,number = a,digit; 
	       // boolean flag=false; 
	        while(number!=0) 
	        { 
	            digit=number%10; 
	            sum+=Math.pow(digit,3); 
	            number=number/10; 
	        } 
	        if(sum==a) 
	           // flag=true; 
				System.out.println("Armstrong Number");
	        else 
				System.out.println("Not Armstrong Number");
			return false;

	    } 

}
