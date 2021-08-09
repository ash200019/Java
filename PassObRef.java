/*PassObRef.java*/


class Test
{
	int a , b;
	Test(int i , int j)
	{
		a = i;
		b = j;
	}
	void meth(Test o)
	{
		o.a *= 2;
		o.b /= 2;
	}
}
public class PassObRef {
   
    public static void main(String[] args) {
       Test ob = new Test(15 , 20);
       System.out.println ("Before call\na = "+a + " b = "+b); 
       	ob.meth(a , b);
       	System.out.println ("After call\na = "+a + " b = "+b); 
    }
}
