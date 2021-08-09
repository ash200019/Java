/*ForEach.java*/

public class ForEach {
   
    public static void main(String[] args) {
       
       int nums[] = {5,6,7,8,9,2,1,4};
       int sum = 0;
       for(int i : nums)
       {
       		System.out.println("x : "+i);
       		sum += i;
       }
       System.out.println("Sum : "+sum);
    }
}
