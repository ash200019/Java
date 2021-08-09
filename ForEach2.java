/*ForEach2.java*/

public class ForEach2 {
    
    public static void main(String[] args) {
        
        int nums[] = {2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int i : nums)
        {
        	System.out.println("x : "+i);
        	sum += i;
        	if(i > 5)
        		break;
        }
        System.out.println("Sum : "+sum);
    }
}
