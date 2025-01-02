package app55;

class A {
    void test1() {
        System.out.println("A-test1");
    }

    void test2() {
        System.out.println("A-test2");
    }
}

public class M12 {
	
	static void m1(A a1) {
		a1.test1();
		a1.test2();
	}

    public static void main(String[] args) {
    	// Using the regular A class
    	m1(new A());
    	System.out.println("-------------------");

    	// Using an anonymous inner class that overrides test1 and test2
    	m1(new A() {
    		@Override
    		void test1() {
    			System.out.println("AIC-test1");
    		}

    		@Override
    		void test2() {
    			System.out.println("AIC-test2");
    		}
    	});
    	System.out.println("---------------------");

    	// Using the regular A class again
    	m1(new A());
    }
}
