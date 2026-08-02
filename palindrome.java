public class palindrome
{
	static boolean palin(int n)
	{
		int dup = n;
		int last_d;
		int rev = 0;
		while(n != 0)
		{
			last_d = n%10;
			rev = (rev * 10)+last_d;
			n = n/10;
		}
		if(dup == rev)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		int n = 3452;
		int j = 1221;
		System.out.println(palin(n));
		System.out.println(palin(j));
	}
}
			
