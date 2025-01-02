package app55;
class A {
	void test1() {
		System.out.println("A-test1");
	}

	void test2() {
		System.out.println("A-test2");
	}
}

public class M8 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.test1();
		a1.test2();

		System.out.println("----------------");

		A a2 = new A() // a2 point to subclass A
		{

		};

		a2.test1();
		a2.test2();

		System.out.println("-------------");

		A a3 = new A() {

			void test1() {
				System.out.println("AIC-test");
			}

		};

		a3.test1();
		a3.test2();

		System.out.println("---------------");

		A a4 = new A() {
			void test2() {
				System.out.println("AIC-test2");
			}
		};

		a4.test1();
		a4.test2();

		System.out.println("---------------");

		A a5 = new A() {
			void test1() {
				System.out.println("AIC-test2");
			}

			void test2() {
				System.out.println("AIC-test2");
			}
		};

		a5.test1();
		a5.test2();

		A a6 = new A() {
			void test3() {

			}

		};
		// a6.test3();// compiler will check a6

		A a7 = new A() {
			void test3() {
				System.out.println("from test3");
			}

			void test1() {
				System.out.println("test begin");
				test3();
				System.out.println("test1 end");
			}
		};
		a7.test1();
		a7.test2();

	}

}
