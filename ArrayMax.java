class Max
{        
    public static void main(String[] args)
{
    if (args.length == 0)
        {
            System.out.println("You must enter at least 1 integer. Please try again.");
            System.exit(0);
        }
    findMax(args);
 
}
 
static void findMax(String[] strValues)
{
int numMax = numbers[0];
        //int maxValue=0;
        for (int i = 0; i < strValues.length; i++)
        {
	        int numbers = Integer.parseInt(strValues[i]);
	        if(numbers[i] > numMax)
	        	{  
		            numMax = numbers[i];
		            System.out.println(numMax);
					System.out.println(numMax);
	        	}
		}
}