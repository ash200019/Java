// generic linear search

class LinearGen <E> {
	E key;
	E [] arr;
	
	LinearGen(E [] a, E key){
		arr = a;
		this.key = key;
	}
	
	public boolean linearSearch(){
		for(int i = 0; i < arr.length; i++)
			if(arr[i] == key) return true;
		return false;
	}
	
}

public class LinearSearchGen{
	
	public static <T extends Comparable<T>> void binarySearch(T [] data, T key){
		int low = 0, mid; int high = (data.length - 1), flag = 0;
		while(low <= high) {
			mid = (low + high) / 2;
			
			if(data[mid].compareTo(key) == 0) {
				System.out.println("Found at " + mid);
				flag = 1;
				break;
			}
			
			else if(data[mid].compareTo(key) < 0) {
				low = mid + 1;
			}
			
			else 
				high = mid - 1;
		}
		if(flag == 0) System.out.println("Not found");
	}
	
	public static void main(String [] args){
		String [] srr = {"hmm", "bmm", "gmm", "omm"};
		Integer [] irr = {1, 56, 23, 54, 77};
		Character [] crr = {'q', 'u', 'e', 'z', ' '};
		
		LinearGen <String> l1 = new LinearGen <> (srr, "omm");
		if(l1.linearSearch()) System.out.println("FOUND");
		binarySearch(srr, "bmm");
		
		LinearGen <Integer> l2 = new LinearGen <> (irr, 54);
		if(l2.linearSearch()) System.out.println("FOUND");
		binarySearch(irr, 54);
		
		LinearGen <Character> l3 = new LinearGen <> (crr, ' ');
		if(l3.linearSearch()) System.out.println("FOUND");	
	}
}
