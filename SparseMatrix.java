
public class SparseMatrix {
	
	private class SparseNode {
		
		int row;
		int collumn;
		int val;
		SparseNode next;
		
		public SparseNode(int r, int c, int v, SparseNode n) {
			row = r;
			collumn = c;
			val = v;
			next = n;
		}
	}
	
	private int size = 0;
	private SparseNode head = null;
	private SparseNode tail = null;
	
	public SparseMatrix() {}
	
	public void insert(int r, int c, int v) {
		if(size == 0) {
			head = new SparseNode(r, c, v, head);
			tail = head;
		}
		else {
			SparseNode newest = new SparseNode(r, c, v, null);
			tail.next = newest;
			tail = newest;
		}
		size ++;
	}
	
	public SparseMatrix fromSparse(int a[][]) {
		SparseMatrix sm = new SparseMatrix();
		for(int i = 0; i < a.length; i ++) {
			for(int j = 0; j < a[i].length; j ++) {
				if(a[i][j] != 0) sm.insert(i, j, a[i][j]);
			}
		}
		return sm;
	}
	
	public int[][] toSparse(int n) {
		int a[][] = new int[n][n];
		SparseNode temp = head;
		for(int i = 0; i < a.length; i++)
			for(int j = 0; j < a[i].length; j++) 
				a[i][j] = 0;
		while(temp != null) {
			a[temp.row][temp.collumn] = temp.val;
			temp = temp.next;
		}
		return a;		
	}
	
	public String toString() {
		if(size == 0) return null;
		String str = "";
		SparseNode temp = head;
		while(temp.next != null) {
			str += temp.row + "|" + temp.collumn + "|" + temp.val + " ---> ";
			temp = temp.next;
		}
		str +=  temp.row + "|" + temp.collumn + "|" + temp.val;
		return str;
	}
	
}
			
			
		
		
		 
