public class removedup
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,2,3,4};
		int i = 0;
		for(int j = 1; j<arr.length; j++)
		{
			if(arr[i] != arr[j])
			{
				arr[i+1] = arr[j];
				i++;
			}
		}
		System.out.println(i+1);
		int n = i+1;
		int unique[] = new int[n];
		for(int k = 0; k<n; k++)
		{
			unique[k] = arr[k];
			System.out.println(unique[k]);
		}
	}
}