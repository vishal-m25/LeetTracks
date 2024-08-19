class Solution {
    public int findMin(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        return Collections.min(l);
    }
}
