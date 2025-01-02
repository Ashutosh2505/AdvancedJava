package app55;

public class M7 {

	public static void main(String[] args) {
		int i = 10;
		final int j = 20;

		class A {
			void test() {
				//System.out.println(i);
				System.out.println(j);
			}
		}
		A a1 = new A();
		a1.test();

		// i = 10;
	    // j = 30;
		i = 40;
		a1.test();
	}

}
