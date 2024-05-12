class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length - 2; i++){
           int sum = nums[i] + twoSumClosest(nums, target - nums[i], i);
            if(ans == Integer.MIN_VALUE || Math.abs(sum - target) < Math.abs(ans - target)){
                ans = sum;
            }
        }
        return ans;
    }
    public int twoSumClosest(int[] nums, int k, int st){
        int si = st + 1;
        int ei = nums.length - 1;
        int ans = Integer.MIN_VALUE;
        while(si < ei){
            int sum = nums[si] + nums[ei];
            if(ans == Integer.MIN_VALUE || Math.abs(sum - k) < Math.abs(ans - k)){
                ans = sum;
            }
            if(sum == k){
                return sum;
            }else if(sum < k){
                si++;
            }else{
                ei--;
            }
            
        }
        return ans;
    }
}
