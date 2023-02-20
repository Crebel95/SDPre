import java.util.Scanner;

public class Objective4Lab2 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);


		System.out.print ("Please enter the first whole number you would like to add.");
		int num1 = keyboard.nextInt();
		System.out.println (num1);

		System.out.print ("Please enter the second whole number you would like to add.");
		int num2 = keyboard.nextInt();
		System.out.println (num2);

		System.out.print ("please enter the third number you would like to add.");
		int num3 = keyboard.nextInt();
		System.out.println (num3);

		System.out.print ("Please enter the first decimal number you would like to add.");
		double dub1 = keyboard.nextInt();
		System.out.println (dub1);

		System.out.print ("Please enter the second decimal number you would like to add.");
		double dub2 = keyboard.nextInt();
		System.out.println (dub2);

		System.out.print ("Please enter the third decimal number you would like to add.");
		double dub3 = keyboard.nextInt();
		System.out.println (dub3);

        int sum = num1 + num2 + num3;
		double sum2 = dub1 + dub2 + dub3;

		System.out.println ("The sum of " + num1 + "+" + num2 + "+" + num3  + "=" + sum);
		System.out.println ("The sum of " + dub1 + "+" + dub2 + "+" + dub3  + "=" + sum2);
	
	}
}