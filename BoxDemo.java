class Box
{
	 int length;
	 int breadth;
	 int depth;
	 
	 Box(int l, int b, int d){
		 length = l;
		 breadth = b;
		 depth = d;
 }
	 public String toString()
	 {
		return length+" x "+breadth+" x "+depth;
	 }
}

class BoxDemo
{
	 public static void main(String[]args)
	 {
		 Box box = new Box(10,15,20);
		 System.out.println("Dimensions: "+box);
	 }
}

