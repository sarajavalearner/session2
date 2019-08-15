package session2;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		int avg;
		int count = 0;

		Scanner input = new Scanner(System.in);
		while (num >= 0) {
			num=input.nextInt();
			count++;
			sum=sum+num;
			

			Scanner input1 = new Scanner(System.in);

		}
		avg=(sum-num)/(count-1);
		System.out.println("Average is:"+avg);

	}

}
