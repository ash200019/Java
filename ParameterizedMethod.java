/*ParameterizedMethod.java*/

public class ParameterizedMethod {
        
   static int square1()
   {
   		return 10 * 10;
   }
   static int square2(int i)
   {
   		return i * i;
   }
    public static void main(String[] args) {
        
        System.out.println("The square of 10 is : "+square1());
        //System.out.printl("The square of 5 is : "+square2());
        System.out.println("The square of 8 is : "+square2(8));
    }
}
