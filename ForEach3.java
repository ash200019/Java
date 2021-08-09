/*ForEach3.java*/

public class ForEach3 {
    
    public static void main(String[] args) {
        
        int nums[][] = new int[3][5];
        int i,j,sum = 0;
        for(i = 0 ; i < 3 ; i++)
        {
        	for(j = 0 ; j < 5 ; j++)
        	{
        		nums[i][j] = (i + j);
        	}
        }
        for(int x[] : nums)
        {
        	for(int y : x)
        	{
        		System.out.print(y+" ");
        		sum +=  i;
        	}
        	System.out.println();
        }
        System.out.println("Sum : "+sum);
    }
}
