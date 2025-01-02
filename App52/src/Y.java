class Y
{
	public static void main(String[] args) 
	{
		String s1 = "100.45D";
		Double obj = Double.valueOf(s1);
		double i = obj.doubleValue();
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(i);

	}
}
