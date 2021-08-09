class Q
{
	int n;
	boolean valueSet = false;
	
	synchronized int get()
	{
		while(!valueSet)
		
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("InterruptedException Caught");
			}
			
			System.out.println("Got : " + n);
			valueSet = false;
			notify();
			return n;
	}
	
	synchronized int put(int n)
	{
		while(valueSet)
		
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("InterruptedException Caught");
			}
			
			this.n = n;
			valueSet = true;
			System.out.println("Got : " + n);
			notify();
		 }
	 }
	 
	 class Producer implements Runnable
	 {
		 Q q;
		 Thread t;
		 
		 Producer(Q q)
		 {
			 this.q = q;
			 t = new Thread(this , "Producer");
		 }
		 
		 public void run()
		 {
			 int i = 0;
			 
			 while(true)
			 {
				 q.put(i++);
			 }
		 }
	 }
