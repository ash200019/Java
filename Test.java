/*week 1(5)*/
public class Test
{
	public static void main (String[] args) {
    	int[]x = {1 ,2 ,3 , 4};
    	char[]y = {'a' , 'b' , 'c' ,'d'};
    	for(int i = 0 ; i < x.length ; i += 2)
    		for(int j = y.length ; j > 0 ; j++)
    			if(((i + j) % 2) == 0)
    				System.out.print (x[i]);
    			else
    				System.out.print (y[j]);
    }
}