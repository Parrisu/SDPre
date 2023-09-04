import java.util.Scanner;


public class Objective5Lab4 {
	public static void main(String[] args) {
		
		int num = 6;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		num = input.nextInt();

		

		if(num % 2 == 0) {
			System.out.println("The number is even");
		}
		if(num % 2 == 1) {
			System.out.println("The number is odd");
		}





		input.close();

	}
}