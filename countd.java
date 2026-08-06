public class countd
{
	public static void main(String[] args)
	{
	    int n = 23456;
		int count = 0;
		int lastdigit = n%10;
		
		while(n > 0)
		{
			n = n / 10;
			count++;
		}
		System.out.println("No. of diagits are ="+count);
		System.out.println("Last digit ="+lastdigit);
		
	}
}