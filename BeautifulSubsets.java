import java.util.*;
public class BeautifulSubsets {
    int result;
    int K;

    void solve(int idx, int[] nums, HashMap<Integer, Integer> mp) {
        if (idx >= nums.length) {
            result++;
            return;
        }
        // not_take
        solve(idx + 1, nums, mp); // here comes empty subset when we take nothing it goes to upper condn

        // take
        if (mp.get(nums[idx] - K) == null && mp.get(nums[idx] + K) == null) {
            mp.put(nums[idx], mp.getOrDefault(nums[idx], 0) + 1); // add in map
            solve(idx + 1, nums, mp); // explore
            mp.put(nums[idx], mp.get(nums[idx]) - 1); // remove from map
            if (mp.get(nums[idx]) == 0) {
                mp.remove(nums[idx]);
            }
        }
    }

    int beautifulSubsets(int[] nums, int k) {
        result = 0;
        K = k;

        HashMap<Integer, Integer> mp = new HashMap<>();

        solve(0, nums, mp);

        return result - 1; // excluding empty subset
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int k = 1;
        System.out.println(solution.BeautifulSubsets(nums, k));
    }
}
