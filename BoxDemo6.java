class Box
{
	double width;
	double height;
	double depth;
	Box()
	{
		System.out.println("Constructing box");
		width = height = depth = 10;
	}
	double volume()
	{
		return width * height * depth;
	}
}
class BoxDemo6
{
	public static void main(String args[])
	{
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		System.out.println("Vol is : "+mybox1.volume());
		System.out.println("Vol is : "+mybox2.volume());
	}
}