package com.ontariotechu.sofe3980U;

import java.util.Scanner;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		 Scanner scanner = new Scanner(System.in);
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        System.out.println("Enter first binary number:");
        String input1 = scanner.nextLine();
        Binary binary1 = new Binary(input1);
        System.out.println("First binary number is " + binary1.getValue());

        System.out.println("Enter second binary number:");
        String input2 = scanner.nextLine();
        Binary binary2 = new Binary(input2);
        System.out.println("Second binary number is " + binary2.getValue());

        System.out.println("Choose the operation to perform (1-Add, 2-OR, 3-AND, 4-Multiply):");
        int choice = scanner.nextInt();

        switch(choice) {
            case 1: // Add
                Binary sum = Binary.add(binary1, binary2);
                System.out.println("Sum: " + sum.getValue());
                break;
            case 2: // OR
                Binary orResult = Binary.or(binary1, binary2);
                System.out.println("OR: " + orResult.getValue());
                break;
            case 3: // AND
                Binary andResult = Binary.and(binary1, binary2);
                System.out.println("AND: " + andResult.getValue());
                break;
            case 4: // Multiply
                Binary multiplyResult = Binary.multiply(binary1, binary2);
                System.out.println("Multiplication: " + multiplyResult.getValue());
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        scanner.close();
    }
}
