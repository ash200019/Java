/*Break.java*/

public class Break {
    
    public static void main(String[] args) {
        
        boolean t = true;
        first:
        {
        	second:
        	{
        		third:
        		{
	        		System.out.println("Before the break statement.");
	        		if(t)
	        			break second;
	        		System.out.println("The statement will not be executed.");
        		}
        		System.out.println("The statement will not be executed.");
        	}
        	System.out.println("This is after the second block.");
        }
    }
}
