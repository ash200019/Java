public class P17_Main{
	public static void main(String[] args) {
		P17_1<Integer> obj=new P17_1<Integer>();
		P17_2<Integer> obj1=new P17_2<Integer>();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		System.out.println("Main Stack :");
		obj.getlist();
		int size=obj.size();
		for(int i=0;i<size;i++ ){
			obj1.enqueue(obj.pop());
		}
		System.out.println("Temporary Queue :");
		obj1.getlist();
		System.out.println("Main Stack :");
		for(int i=0;i<size;i++ ){
			obj.push(obj1.dequeue());
		}
		obj.getlist();
	}
}