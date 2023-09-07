import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2, tax;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

		System.out.print("Please provide a number: ");
		num1 = kb.nextDouble();
		System.out.print("Please provide a second number: ");
		num2 = kb.nextDouble();

    // Part 1:
    // prompt the user to provide one number and store their input in num1
    /*
    * Solution for Part 1 goes here
    */

    // Part 2:
    // Prompt the user for another number and store their input in num2
    /*
    * Solution for Part 2 goes here
    */

		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
			case 1:
				findSum(num1, num2);
				break;
			case 2:
				findAverage(num1, num2);
				break;
			case 3:
				calcTax(num1, num2);
				break;
			case 4:
				System.out.println("You've chosen to quit.");
				keepGoing = false;
				break;
			default:
				System.out.print("Invalid Entry. Please try again");
				//code
      // Part 3:
      // Complete this switch, with each case calling one of the methods below,
      // then printing out the result (refer to "Expected Output" below)
			// Don't forget to account for a user accidentally inputting an invalid number!
      /*
      * Solution for Part 3 goes here
      */

			}
		}
		kb.close();
	}

	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

	public static double findSum(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println(num1 + " + "+ num2 + " = "+ sum);
		return sum;
	}
  // Part 4:

  public static double findAverage(double num1, double num2) {
  	double sum = num1 + num2;
  	double average = sum / 2;
  	System.out.println(" The average of " + num1 + " and " + num2 + " is: " + average);
  	return average;
  }
  // Write a method named "findAverage" that takes two doubles as parameters,
  // and returns a double that represents the average of the two parameters.
  // Use the "findSum" method as an example.
  /*
  * Solution for Part 4 goes here
  */
  public static double calcTax(double num1, double num2) {
  	double sum = num1 + num2;
  	double tax = 0.831 % sum;
  	System.out.println("The amount in tax to be collectied from a purchase of " +num1+ " and "+num2+" is: "+tax);
  	return tax;
  }

	// Part 5:
  // Write a method named "calcTax" that also takes two doubles as parameters,
  // and returns a double that represents the amount of tax the user would have
  // to pay based on the total of the two parameters. Use a tax rate of 8.31%
  // (Not a grand total, just the total taxes. Refer to "Expected Output".)
  /*
  * Solution for Part 5 goes here
  */

}

	


	