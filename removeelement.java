public class removeelement
{
    public static void main(String[] args)
    {
        int[] nums = {0,1,2,2,3,0,4,2};
        int value = 2;
        int i = 0;
        int n= nums.length;
        for(int j = 0; j<nums.length; j++)
        {
            if(nums[j] != value)
            {
                swap(nums,i,j);
                i++;
            }
        }
        System.out.println(i); 
    }
    public static void swap(int[] nums, int a, int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}