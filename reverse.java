public class reverse
{
	static int palin(int n)
	{
		int last_d;
		int rev = 0;
		while(n != 0)
		{
			last_d = n%10;
			if(rev > Integer.MAX_VALUE /10){
				return 0;
			}
		    if(rev == Integer.MAX_VALUE / 10 && last_d > 7)
			{
                return 0;
			}		
            if(rev == Integer.MIN_VALUE / 10 && last_d < -8)
			{
                return 0;
			}				
			rev = (rev * 10)+last_d;
			n = n/10;
		}
		return rev;
	}
	public static void main(String[] args)
	{
		int n = 1534236469;
		int reverse = palin(n);
		System.out.println("Reverese of " +n+ " is =" +reverse);
	}
}