import java.util.*;
class solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;

        int longest = 1; 
        Set<Integer> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }

       
        for (int it : st) {
            if (!st.contains(it - 1)) {
                int cnt = 1; 
                int x = it; 

                while (st.contains(x + 1)) {
                    x = x + 1; 
                    cnt = cnt + 1; 
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }
}

class conse_seq {
    public static void main(String[] args) {
        solution s = new solution();
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(s.longestConsecutive(nums));
    }   
    
}