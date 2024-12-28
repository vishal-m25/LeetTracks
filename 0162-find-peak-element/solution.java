class Solution {
    public int findPeakElement(int[] nums) {
        int i=0,j=nums.length-1,k=0;
        while(i<=j){
            if(nums[k]<nums[i]){
                k=i;
            }
            if (nums[k]<nums[j]){
                k=j;
            }
            i++;
            j--;
        }
        return k;
    }
}
