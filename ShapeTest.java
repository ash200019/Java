abstract class Shape
{
	public abstract void draw();
	public void message();
	{
		System.out.println ("Message for U");
	} 
} 
class Circle extends Shape
{
	public void draw()
	{
		System.out.println ("Circle drawn.");
	}
}
class Boxs extends Shape()
{
	public void draw()
	{
		System.out.println ("Box drawn.");
	}
}
class SahpeTest
{
	public static void main(String args[])
	{
		Circle c = new Circle();
		Boxs b = new Boxs();
		c.draw();
		b.draw();
		c.message();
	}
}