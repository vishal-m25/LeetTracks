class Solution {
    public void rotate(int[] nums, int l) {
     int ar[]=nums.clone();
     int j=l%nums.length;
     j=nums.length-j;
     int k=0;
     for(int i=j;i<nums.length;i++){
        nums[k++]=ar[i];
     }   
     for(int i=0;i<j;i++){
        nums[k++]=ar[i];
     }
    }
}
