class Solution {
    public int[] shuffle(int[] nums, int n) {
        n=2*n;
        int arr1[]=new int[(n/2)];
        int arr2[]=new int[(n/2)];
        for(int i=0;i<n/2;i++)
        arr1[i]=nums[i];
        for(int j=0,i=(n/2);j<arr2.length;j++,i++)
        arr2[j]=nums[i];
        for(int i=0,j=0;i<arr1.length;i++,j+=2)
        nums[j]=arr1[i];
        for(int i=0,j=1;i<arr2.length;i++,j+=2)
        nums[j]=arr2[i];
        return nums;
    }
}
