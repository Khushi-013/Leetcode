class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, currentCount = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            currentCount = (nums[i] == 1) ? currentCount + 1 : 0;
            if (currentCount > maxCount) maxCount = currentCount;
        }
        return maxCount;
    }
}
