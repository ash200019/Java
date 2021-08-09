class Gen<T,V>
{
	T ob1;
	V ob2;
	Gen(T ob1 , V ob2)
	{
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	void showType()
	{
		System.out.println("Type of T is : " + ob1.getClass().getName());
		System.out.println("Type of V is : " + ob2.getClass().getName());
	}
}

class GenDemo
{
	public static void main(String[]args)
	{
		Gen<Integer , String> obj = new Gen<Integer , String> (50 , "Generics");
		obj.showType();
	}
}
