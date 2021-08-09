class DrawRular
{
	public static void main(String args[])
	{
		drawRular(2 , 5);
	}
	public static void drawRular(int nInches , int majorLength)
	{
		drawLine(majorLength , 0);
		for(int j = 1 ; j <= nInches ; j++)
		{
			drawInterval(majorLength - 1);
			drawLine(majorLength , j);
		}
	}
	public static void drawInterval(int centralLength)
	{
		if(centralLength >= 1)
		{
			drawInterval(centralLength - 1);
			drawLine(centralLength);
			drawInterval(centralLength - 1);
		}
	}
	public static void drawLine(int tickLength , int tickLabel)
	{
		for(int j = 0 ; j < tickLength ; j++)
		{
			System.out.println("-");
		}
		if(tickLabel >= 0)
		{
			System.out.print(" "+tickLabel);
		}
		System.out.println("\n");
	}
	public static void drawLine(int tickLength)
	{
		drawLine(tickLength , -1);
	}
}
