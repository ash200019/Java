// accessing directories and returning total size of the file in them
import java.io.File;

public class FileRecursion{
	
	public static void main(String [] args){
		File root = new File(args [0]);
		System.out.println("Total bytes: " + diskUsage(root));
	}
	
	public static long diskUsage(File root){
		long total = root.length();
		if(root.isDirectory())
			for(String childname : root.list()){
				File child = new File(root, childname);
				total += diskUsage(child);
			}
		System.out.println(total + "	" + root);
		return total;
	}
}
