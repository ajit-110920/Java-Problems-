public class pattern
{
	static void pattern1(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void pattern2(int n)
	{
		for(int i=1; i<n; i++)
		{
			for(int j=1; j<n-i+1; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void pattern3(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-i+1; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<2*i-1; j++)
			{
				System.out.print("*");
			}
			for(int j=0; j<n-i+1;j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	static void pattern4(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<2*n-(2*i+1); j++)
			{
				System.out.print("*");
			}
			for(int j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	static void pattern5(int n)
	{
		int start = 1;
		for(int i=0; i<n; i++)
		{
			if(i % 2 == 0)
			{
				start = 1;
			}
			else
			{
				start=0;
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print(start);
				start = 1-start;
			}
			System.out.println();
		}
	}
	static void pattern6(int n)
	{
		char ch = 'A';
		for(int i=0; i<n; i++)
		{
			if(i % 2 == 0)
			{
				ch = 'A';
			}
			else
			{
				ch= 'B';
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print(ch);
				ch = (ch == 'A')? 'B':'A';
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		pattern6(5);
	}
}
	   
		
		