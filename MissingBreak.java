/*MissingBreak.java*/

public class MissingBreak {
    
    public static void main(String[] args) {
        
        int marks = 90;
        switch(marks/10)
        {
	        case 10 : case 9 :
	        	System.out.println("Grade : A");
	        	break;
	        case 8 : case 7 :
	        	System.out.println("Grade : B");
	        	break;
	        case 6 : case 5 :
	        	System.out.println("Grade : C");
	        	break;
	        default :
	        	System.out.println("Grade : D");
        }
    }
}
