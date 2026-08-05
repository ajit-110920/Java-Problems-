import java.util.*;

public class intersection
{
	public int[] intersection(int[] nums1, int[] nums2)
	{
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums1.length; i++)
		{
			set.add(nums1[i]);
		}

		HashSet<Integer> set1 = new HashSet<>();
		for (int i = 0; i < nums2.length; i++)
		{
			if (set.contains(nums2[i]))
			{
				set1.add(nums2[i]);
			}
		}

		int[] ans = new int[set1.size()];
		int i = 0;
		for (int num : set1)
		{
			ans[i] = num;
			i++;
		}
		return ans;
	}

	public static void main(String[] args)
	{
		intersection obj = new intersection();
		int[] arr = {1, 2, 2, 1};
		int[] arr1 = {2, 2};
		int[] ans = obj.intersection(arr, arr1);
		for (int i = 0; i < ans.length; i++)
		{
			System.out.print(ans[i] + " ");
		}
	}
}
