package atiAssignment;

import java.util.Scanner;

public class ExitLoop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        char repeat = 'y';
        while (repeat == 'y') {
            System.out.println("What is the command keyword to exit a loop in Java?");
            System.out.println("a.int");
            System.out.println("b.continue");
            System.out.println("c.break");
            System.out.println("d.exit");
            System.out.print("Enter your choice:");
            char answer = in.next().charAt(0);
            if ((answer == 'a') || (answer == 'b') || (answer == 'd')) {
                System.out.println("Incorrect !");
                System.out.println("Again? press y to continue: ");
                repeat = in.next().charAt(0);
            } else {
                System.out.println("Correct!");
                repeat = 'n';
            }
        }
	}

}
