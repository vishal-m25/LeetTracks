class Solution {
    public int maximumProduct(int[] nums) {
        int s=nums.length-1;
        Arrays.sort(nums);
        int a=nums[s]*nums[s-1]*nums[s-2];
        int b=nums[0]*nums[1]*nums[s];
        return (a>b) ? a:b;
    }
}
