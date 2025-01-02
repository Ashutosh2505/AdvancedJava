package app53;

public class M {
	public static void main(String[] args) {
		int i = test(); // int i = test().intValue();
		System.out.println(i);
	}

	static Integer test() {
		return Integer.valueOf(100);
	}

}
