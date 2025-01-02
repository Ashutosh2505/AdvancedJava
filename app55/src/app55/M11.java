package app55;

interface D {
    void test1(); // Add semicolon at the end
    void test2(); // Define test2 method in the interface
}

public class M11 {
    public static void main(String[] args) {
        D d1 = new D() {
            @Override
            public void test1() {
                System.out.println("A-test");
            }

            @Override
            public void test2() {
                System.out.println("A-tree");
            }
        };
        
        d1.test1();  // Calls test1 method
        d1.test2();  // Calls test2 method
    }
}
