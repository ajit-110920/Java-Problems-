public class larfac
{
	public static void main(String[] args)
	{
		int n = 97;
		int larfac = 0;
		int count = 0;
		for(int i = 2; i*i<= n; i++)
		{
			if(n % i == 0)
			{
				count++;
				larfac=i;
			}
		}
		if(count == 2)
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Not prime");
			}
			System.out.println(larfac);
	}
}