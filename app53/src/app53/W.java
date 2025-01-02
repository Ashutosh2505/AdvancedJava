package app53;

public class W {
	Integer obj;
	W(){
		int i = obj;
	}
	public static void main(String[] args) {
		W obj = new W();
		System.out.println("done");
	}

}

//public class W {
//    Integer obj = Integer.valueOf(0);  // Initialize obj to a valid value
//
//    W() {
//        int i = obj;  // Safe unboxing
//    }
//
//    public static void main(String[] args) {
//        W obj = new W();
//        System.out.println("done");  // Successfully prints "done"
//    }
//}
