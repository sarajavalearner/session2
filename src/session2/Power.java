package session2;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		float num1=-1;
		float num2;
		int fact = 1;
		float s = 1;
		
		

		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number:");
		num1 = input.nextFloat();
		System.out.println("Enter second number:");
		num2 = input.nextFloat();
		num1=num1*(-1);
		float power = 1;
		for (int i = 1; i <= num2; i++) {

			power = power * num1;
			fact = fact * i;
			s = (power / fact);

		}

		System.out.println("hasel:" + s);

	}

}
