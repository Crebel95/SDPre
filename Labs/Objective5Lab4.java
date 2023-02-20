import java.util.Scanner;

public class Objective5Lab4 {
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Please enter a numer: ");
	int num = input.nextInt();

	if(num % 2 == 0) {
		System.out.println("The number is even");
	}

		else if(num % 2 != 0) {
			System.out.println("The number is odd");
		}

			input.close();


	
}
}