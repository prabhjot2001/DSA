package DSA.arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int minDistance = Integer.MAX_VALUE;
        int resultantSum = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int distance = Math.abs(target - sum);
                    if (distance < minDistance) {
                        minDistance = distance;
                        resultantSum = sum;
                    }
                }
            }
        }
        return resultantSum;
    }
}

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = { -1000, -999, -998, -997, -996, -995, -994, -993, -992, -991, -990, -989, -988, -987, -986, -985,
                -984, -983, -982, -981, -980, -979, -978, -977, -976, -975, -974, -973, -972, -971, -970, -969, -968,
                -967, -966, -965, -964, -963, -962, -961, -960, -959, -958, -957, -956, -955, -954, -953, -952, -951,
                -950, -949, -948, -947, -946, -945, -944, -943, -942, -941, -940, -939, -938, -937, -936, -935, -934,
                -933, -932, -931, -930, -929, -928, -927, -926, -925, -924, -923, -922, -921, -920, -919, -918, -917,
                -916, -915, -914, -913, -912, -911, -910, -909, -908, -907, -906, -905, -904, -903, -902, -901, 1, 2, 3,
                4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        int target = -1;
        Solution solution = new Solution();
        System.out.println(solution.threeSumClosest(nums, target));
    }
}