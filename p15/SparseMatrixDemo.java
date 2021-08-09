public class SparseMatrixDemo {
	public static void main(String [] args) {
	int a[][] = { {0, 0, 0, 0, 0}, {0, 0 , 1, 0, 0}, {0, 0, 4, 0,0}, {0, 2, 0, 0, 0} };
	SparseMatrix sm = new SparseMatrix();
	SparseMatrix sm2 = sm.fromSparse(a);
	System.out.println(sm2);
	int arr[][] = sm2.toSparse(5);
	for(int i = 0; i < a.length; i++) {
		for(int j = 0; j < a[i].length; j++) 
			System.out.print(arr[i][j] + " ");
		System.out.println();
		}	
	}
}
	
	
