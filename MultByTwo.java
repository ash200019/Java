/*MultByTwo.java*/

//Left shifting by one bit is a quicker way to multiply any any number with 2

public class MultByTwo {
        
    
    public static void main(String[] args) {
        
        int i,num = 0xFFFFFFe;
        System.out.println("The number is : "+num);
        for(i = 0 ; i <  4 ; i++)
        {
	      	num = num << 1;
	        System.out.println("The answer is : "+num);
        }
    }
}
