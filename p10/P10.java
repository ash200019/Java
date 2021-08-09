public class P10 {
	
	private class PolyNode {
		
		int coeff;
		int exp;
		PolyNode next;
		
		public PolyNode(int c, int e, PolyNode next) {
			coeff = c;
			exp = e;
			this.next = next;
		}
		
		public PolyNode getNext() {return next;}
	}
	
	private int size = 0;
	private PolyNode head = null;
	private PolyNode tail = null;
	
	public P10() {}
	
	public void insert(int c, int e) {
		if(size == 0) {
			head = new PolyNode(c, e, head);
			tail = head;
		}
		else {
			PolyNode newest = new PolyNode(c, e, null);
			tail.next = newest;
			tail = newest;
		}
		size ++;
	}
	
	public P10 add(P10 p) {
		PolyNode n1 = p.head;
		PolyNode n2 = this.head;
		P10 newest = new P10();
		
		while(n1 != null && n2 != null) {
			if(n1.exp == n2. exp) {
				newest.insert((n1.coeff + n2.coeff), n1.exp);
				n1 = n1.getNext();
				n2 = n2.getNext();
			}
			else if(n1.exp < n2.exp) {
				newest.insert(n2.coeff, n2.exp);
				n2 = n2.next;
			}
			else {
				newest.insert(n1.coeff, n1.exp);
				n1 = n1.next;
			}
		}
		
		while(n1 != null) {
			newest.insert(n1.coeff, n1.exp);
			n1 = n1.next;
		}
		
		while(n2 != null) {
			newest.insert(n2.coeff, n2.exp);
			n2 = n2.next;
		}
		return newest;		
	}
	public String toString(){
		if(size == 0) return "null";
		String str = "";
		PolyNode temp = head;
		
		while(temp.next != null) {
			str += temp.coeff + "x^" + temp.exp + " + ";
			temp = temp.next;
		}
		str += temp.coeff + "x^" + temp.exp;
		return str; 
	}
}
		
