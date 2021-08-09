/*NestedIfElse.java*/

public class NestedIfElse {
   
    public static void main(String[] args) {
       
       int a = 100 , b = 200 , c = 50 , greatest;
       if(a > b)
       {
       		if(a > c)
       			greatest = a;
       		else
       			greatest = c;
       }
       else
       {
	      if(b > c)
	       	greatest = b;
	       else
	       	greatest = c;
       }
       System.out.println(greatest);
    }
 }
