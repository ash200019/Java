class BoxDemo
{
	double width;
	double height;
	double depth;
	Box(double w , double h , double d)
	{
		width = w;
		height = h;
		depth = d;
	}
	double volume()
	{
		return width * height * depth;
	}
}
class BoxDemo7
{
	
	public static void main(String args[])
	{
		Box mybox1 = new Box(40 , 20 , 10);
		Box mybox2 = new Box(8 , 5 , 3);
		System.out.println("Vol : "+mybox1.volume());
		System.out.println("Vol : "+mybox2.volume());
	}
}