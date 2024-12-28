class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        if(nums[0]<nums[r]) return nums[0];
        while(l<=r){
            int m=(l+r)/2;
            if(nums[m]>nums[nums.length-1])
            l=m+1;
            else r=m-1;
        }return nums[l];
    }
}
