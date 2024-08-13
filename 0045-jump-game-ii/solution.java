class Solution {
    public int jump(int[] nums) {
        int jumps = 0, e = 0, f = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            f = Math.max(f, i + nums[i]);

            if (i == e) {
                jumps++;
                e = f;
            }
        }

        return jumps;
    }
}
