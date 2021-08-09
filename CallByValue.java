/*Call By Value.java*/

class Test
{
	void meth(int i , int j)
	{
		i *= 2;
		j /= 2;
	}
}
class CalByValue
{
	public static void main (String[] args) {
    	Test ob = new Test();
    	int a = 15 , b = 20;
    	System.out.println ("Before call\na = "+a + " b = "+b); 
    	System.out.println ("After call\na = "+a + " b = "+b); 
    }
}