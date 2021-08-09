/*Light.java */

public class Light {
        
    
    public static void main(String[] args) {
        
        double  speed = 300000000;
        for(long sec = 0 ; sec < 3600 ; sec++)
        	System.out.println("In "+sec + " sec light covers "+((sec * speed) / 1000)+ "km distance." );
        
    }
}
