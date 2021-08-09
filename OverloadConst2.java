/*OverloadConst2.java*/

class Box
{
	double width , height , depth;
	Box(Box ob)
	{
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	Box(double w , double h , double d)
	{
		width = w;
		height = h;
		depth = d;			
	}
	Box()
	{
		width = -1;
		height = -1;
		depth = -1;
	}
	Box(double len)
	{
		width = height = depth = len;
	}
	double volume()
	{
		return width * height * depth;
	}
}
public class OverloadConst2 {
    
    public static void main(String[] args) {
        Box mybox1 = new Box(20 , 15 , 10);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1);
        System.out.println ("Vol of mybox1 = "+mybox1.volume());
        System.out.println ("Vol of mybox2 = "+mybox2.volume());
        System.out.println ("Vol of mycube = "+mycube.volume());
        System.out.println ("Vol of myclone = "+myclone.volume());
    }
}
