import java.util.Arrays;

public class subarray {
    public int[] subar(int[] nums) {
        int sum = 0;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += nums[i];
            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        
        if (ansStart == -1) return new int[]{};

        return Arrays.copyOfRange(nums, ansStart, ansEnd + 1);
    }

    public static void main(String[] args) {
        subarray obj = new subarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; 
        int[] result = obj.subar(nums);
        
        System.out.println(Arrays.toString(result)); 
    }
}
