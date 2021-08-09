/*Menu.java */

 import java.io.*;
 class Menu {
    
    public static void main(String[] args) 
    	throws IOException {
        char choice;
        do{
        	System.out.print("1. Sum\n");
        	System.out.print("2. Sub\n");
        	System.out.print("3. Multiply\n");
        	System.out.print("4. Devide\n");
        	System.out.print("5. Modulous\n");
        	System.out.print("Choose any of one:");
        	choice = (char)System.in.read();
        }while(choice < '1' && choice > '6');
        System.out.println();
        switch(choice)
        {
        	case '1':
        		System.out.println("You have choose 1. SUM");
        		break;
        	case '2':
        		System.out.println("You have choose 2. SUB");
        		break;
        	case '3':
        		System.out.println("You have choose 3. MULTIPLY");
        		break;
        	case '4':
        		System.out.println("You have choose 4. DEVIDE");
        		break;
        	case '5':
        		System.out.println("You have choose 5. MODULOUS");
        		break;
        	default:
        		System.out.println("PLEASE ENTER A VALID CHOICE");
        }
    }
}
