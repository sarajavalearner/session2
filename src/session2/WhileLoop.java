package session2;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		String str="";
		while(!"X".equals(str.toUpperCase())) {
			Scanner scanner = new Scanner(System.in);
			str = scanner.nextLine();
			System.out.println(str);
		}
	}
}
