/*Sum1ton.java*/

import java.io.*;
public class Sum1ton {
    
    public static void main(String[] args) throws IOException{
    
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str;
        System.out.println("Enter a positive inreger (1 - 100): ");
        str = br.readLine();
        int sum = 0;
        int n = Integer.parseInt(str);
        for(int i = 1 ; i <= n ; i++)
        	sum += i;
        System.out.println("Sum : "+sum);
    }
}
