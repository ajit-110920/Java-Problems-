import java.util.*;
public class revarray
{
	static void reverse(int num[],int start, int end)
	{
		while(start <= end)
		{
		   int temp = num[start];
		   num[start] = num[end];
		   num[end] = temp;
		   start++;
		   end--;
		}
	}
    public static void main(String[] args)
    {
	   int[] num = {1,2,3,4,5,6,7,8};
	   int k = 3;
	   reverse(num,0,num.length-1);
	   reverse(num,0,k-1);
	   reverse(num,k,num.length-1);

	   for(int n : num)
	   {
		   System.out.print(n+" ");
	   }
    }
}
	
  
	