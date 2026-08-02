import java.util.*;
public class hmap
{
	public static void main(String[] args)
	{
		int[] arr = {7,4,5,9,7,7,1,4,5};
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i],1);
			}
		}
		int maxElement = arr[0];
        int maxCount = 0;

		System.out.println("Number  |  Frequency");
		for(Map.Entry<Integer,Integer> entry : map.entrySet())
		{
			if(entry.getValue() > maxCount)
			{
				maxCount = entry.getValue();
				maxElement = entry.getKey();
			}
		}
		System.out.println(maxElement+"       "+maxCount);
	}
}