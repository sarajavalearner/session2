package session2;

public class ForLoop {
	public static void main(String[] args) {
//		test1();
		test2();

	}

	public static void test2() {
		System.out.println("-------100 to 1 numbers:");
		for (int i = 100; i > 0; i = i - 1) {
			System.out.println(i);
		}
	}

	public static void test1() {
		System.out.println("-------Even Numbers:");
		for (int i = 0; i < 100; i = i + 2) {
			System.out.println(i);

		}

		System.out.println("-------%3=0 Numbers:");
		for (int i = 0; i < 100; i = i + 3) {
			System.out.println(i);

		}

		System.out.println("-------Odd Numbers:");
		for (int i = 1; i < 100; i = i + 2) {
			System.out.println(i);

		}

		System.out.println("-------%17 Numbers:");
		for (int i = 0; i < 100; i = i + 17) {
			System.out.println(i);
		}
	}
}
