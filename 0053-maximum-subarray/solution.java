class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,max=nums[0];
        for(int i:nums){
            if(sum<0){
                sum=0;
            }
            sum+=i;
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }
}
