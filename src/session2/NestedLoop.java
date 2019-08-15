package session2;
import java.util.Scanner;
public class NestedLoop {
	public static void main(String[] args) {
		
//		simpleNestedLoop();
		int i;
		int j;
		int m;
		int n;
		System.out.println("GIve me I:");
		Scanner input= new Scanner(System.in);
		m=input.nextInt();
		System.out.println("Giv me J:");
		Scanner input1=new Scanner(System.in);
		n=input.nextInt();
		for(i=1;i<=m;i++) {
			for(j=1;j<=n;j++) {
				
				System.out.print("*");

			}
			System.out.println("");
			
			

		}
	}
}
	
