package practice;

import java.util.Scanner;

public class Ajay {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        int number;
        do {
            System.out.print("Enter a number  ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter a number  ");
                scanner.next(); // Consume the invalid input
            }
            number = scanner.nextInt();

            if (number >= 1 && number <= 9) {
                System.out.println("Number: " + number);
            } else if (number != 0) {
                System.out.println("Invalid input. Please enter a number between 1 and 9, or 0 to exit.");
            }
        } while (number != 0);

        System.out.println("Exiting the program.");
        scanner.close();
    }
}

