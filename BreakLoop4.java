/*BreakLoop4.java*/

public class BreakLoop4 {
   
    public static void main(String[] args) {
        int i,j;
        outer:
        	for(i = 0 ; i < 3 ; i++)
        	{
        		System.out.println("Pass "+ i +" : ");
        		for(j = 0; j < 100 ; j++)
        		{
        			if(j == 10)
        				break outer;
        			System.out.println (" "+j);	
        		}
        		System.out.println ("This will not print");
        	}
        	System.out.println ("Out of the loop.");
    }
}
