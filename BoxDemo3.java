/*BoxDemo3.java*/

class Box 
{
	double width;
	double height;
	double depth;
	void volume()
	{
		System.out.print("vol is : ");
		System.out.println(width * height * depth);
	}
}
public class BoxDemo3 {
        
    public static void main(String[] args) {
        
       Box mybox1 = new Box();
       Box mybox2 = new Box();
       mybox1.width = 40;
       mybox1.height = 20;
       mybox1.depth = 10;
       mybox2.width = 15;
       mybox2.height = 10;
       mybox2.depth = 5;
       mybox1.volume();
       mybox2.volume();
    }
}
