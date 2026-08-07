class moveZeroes {
    static void swap(int[] num, int start, int end)
    {
        int temp = num[start];
        num[start] = num[end];
        num[end] = temp;
    }
    public void moveZeroes(int[] nums) {
        int j=-1;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] == 0)
            {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return;
        }
        for(int i=j+1; i<nums.length;i++)
        {
            if(nums[i] != 0)
            {
                swap(nums,i,j);
                j++;
            }
        }
    }
public static void main(String[] args) {
        moveZeroes obj = new moveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        obj.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}