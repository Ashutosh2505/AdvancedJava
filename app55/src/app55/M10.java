
package app55;
abstract class C {
	abstract void test1();

	void test2() {
		System.out.println("C-test2");
	}
  }

  public class M10 {
	public static void main(String[] args) {
		// c c1 = new C()
		// C c2 = new C() {

	};

	C c3 = new C() {
	void test1() {
		
			System.out.println("AIC-test1");
			}
		};
		//C3.test1();
		//C3.test2();
}


