public class Objective7Lab4 {
	public static void main(String[] args) {
		int counter = 20;
		int sum = 0;
		int num1 = 1;
		int num2 = 1;

		while (counter > 0) {
			if(sum == 0){
				sum = sum + num1;
				counter = counter - 1;
			}
			else if(sum > 0) {
				num1 = num1 + num2;
				sum = sum + num1;
				counter = counter -1;
			}

			
		}
		System.out.println(sum);
	}
}