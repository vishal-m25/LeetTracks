class Solution {
    public boolean canJump(int[] nums) {
        int t = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (t <= i + nums[i]) {
                t = i;
            }
        }
        return t == 0;
    }
}
