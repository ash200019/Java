/*Factorial.java*/


class Rec
{
	int fact(int n)
	{
		if(n == 1)
			return 1;
		else return (n * fact(n-1));
	}
}
public class Factorial {
  
    public static void main(String[] args) {
        
        Rec f = new Rec();
        System.out.println ("3's factorial : "+ f.fact(3));
        System.out.println ("4's factorial : "+ f.fact(4));
        System.out.println ("5's factorial : "+ f.fact(5));
    }
}
