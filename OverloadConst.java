/*OverloadConst.java*/


class Box
{
	double width , height , depth;

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

public class OverloadConst {
    
    public static void main(String[] args) {
        Box mybox1 = new Box(20 , 15 , 10);
        Box mybox2 = new Box();
        Box mycube = new Box(10);
        System.out.println ("Vol of mybox1 : "+mybox1.volume());
        System.out.println ("Vol of mybox2 : "+mybox2.volume());
        System.out.println ("Vol of mycube : "+mycube.volume());
    }
}
