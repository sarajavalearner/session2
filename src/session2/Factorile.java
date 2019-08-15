package session2;

import java.util.Scanner;

public class Factorile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		int n ;

		n=input.nextInt();
		

		
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact=fact*i;

		}
		System.out.println(fact);

	}

}
