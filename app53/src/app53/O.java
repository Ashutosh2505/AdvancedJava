package app53;

public class O {
	public static void main(String[] args) {
		byte b1 = 10;
		double d1 = test1(b1);
		// test(Byte.valueOf(b1)).doubleValue();
		System.out.println("done");
	}
	static Double test1(Byte b1) {
		return test2(b1); 
		// return Double.valueOf(test2(b1.byteValue()));
	}
	static double test2(byte b1) {
		return b1;
	}

}
