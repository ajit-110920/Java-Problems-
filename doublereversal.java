public class doublereversal
{
	static boolean palin(int n)
	{
		int dup = n;
		int last_d;
		int rev = 0;
	    int rev1 = 0;
		int last_d1;
		while(n != 0)
		{
			last_d = n%10;
			rev = (rev * 10)+last_d;
			n = n/10;
		}
		System.out.println("reverse 1="+rev);
		while(rev != 0)
		{
			last_d1 = rev%10;
			rev1 = (rev1 * 10)+last_d1;
			rev = rev/10;
		}
		System.out.println("reverse 2="+rev1);
		if(dup == rev1)
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