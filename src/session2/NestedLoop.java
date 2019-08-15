package session2;

public class NestedLoop {
	public static void main(String[] args) {
		simpleNestedLoop();
	}
	
	public static void simpleNestedLoop() {
		for(int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				System.out.print("i="+i+",j="+j+"|");
			}
			System.out.println("");
		}
	}
}
