class I
{
    public static void main(String[] args)
    {
        boolean i = 20;
        Boolean obj = Boolean.valueOf(i);//boxing
        boolean j = obj.booleanValue();//unboxing
        System.out.println(obj);//obj.toString()
        System.out.println(i);
        System.out.println(j);
    }
}