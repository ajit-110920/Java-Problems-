class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 1;
        for(int i = 0; i<nums.length; i++)
        {
            int x = nums[i];
            int count = 1;
            while(linearSearch(nums,x+1) == true)
            {
                x = x+1;
                count = count + 1;
                
                if(count > max)
                {
                    max = count;
                }

            }
        }
        if(nums.length == 0)
        {
            return 0;
        }
        else
        {
            return max;   
        }
    }
    public boolean linearSearch(int arr[], int target)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == target)
            {
                return true;
            }
        }
        return false;
    }
}
public class brute128 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(s.longestConsecutive(nums));
    }
}