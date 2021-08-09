/*BoxDemo.java*/

class Box
{
	double width;
	double height;
	double depth;
}
class BoxDemo {
        
    
    public static void main(String[] args) {
        Box mybox = new Box();
        mybox.height = 40;
        mybox.width = 20;
        mybox.depth = 10;
        double vol;
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume is : "+vol);
    }
}
