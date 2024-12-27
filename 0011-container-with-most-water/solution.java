class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0,j=n-1;
        int k=0,l;
        while(i<j){
            l=Math.min(height[i],height[j])*(j-i);
            k=Math.max(l,k);
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return k;
    }
}
