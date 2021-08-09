/*)Bool.java*/

public class Bool {
        
    
    public static void main(String[] args) {
        
        boolean b;
        b = false;
        System.out.println("b is : "+b);
        b = true;
        System.out.println("b is : "+b);
        if(b)
        	System.out.println("The program is executed.");
        b = false;
        if(b)
        	System.out.println("The program is not executed.");
        System.out.println("10 > 9 is : "+(10 > 9));
        System.out.println("9 > 10 is : "+(9 > 10));
    }
}
