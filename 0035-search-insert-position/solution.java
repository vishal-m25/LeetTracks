class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1,m=-1;
        if (nums[nums.length-1]<target)
        return nums.length;
        if (nums[0]>target)
        return 0;
        while(l<=r){
            m=(l+r)/2;
            if (nums[m]==target)
            return m;
            if (nums[m]<target)
            l=m+1;
            else
            r=m-1;
        }
        return l;
        
    }
}
