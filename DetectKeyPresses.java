package atiAssignment;

import java.util.Scanner;

public class DetectKeyPresses {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("press a key : ");
        char key = in.next().charAt(0);
        switch (key) {
	
		case '0': System.out.println("You pressed 0."); break;
		case '1': System.out.println("You pressed 1."); break;
		case '2': System.out.println("You pressed 2."); break;
		case '3': System.out.println("You pressed 3."); break;
		case '4': System.out.println("You pressed 4."); break;
		case '5': System.out.println("You pressed 5."); break;
		default: System.out.println("Not allowed!"); break;

		     }

		  }

}
