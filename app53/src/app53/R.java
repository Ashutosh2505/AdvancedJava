package app53;

public class R {
	public static void main(String[] args) {
		test("hello");
		test("abc",30);
		test("ashu",40,50);
		test("wwe",60,100,30);
		test("www",20,100,300,2);
		test("for",50,20,1,3,45,500);
	}
	static void test(String s1 , int ...args) {
		System.out.println(s1);
		for(int i : args) {
			System.out.println(i);
		}
		System.out.println("-----------");
	}

}
