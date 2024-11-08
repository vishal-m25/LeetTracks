class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1,area =0,rmax=height[height.length-1],lmax=height[0];
        while(l<r){
            if(height[l]<height[r]){
                lmax=Math.max(height[l],lmax);
                area+=lmax-height[l];
                l++;
            }
            else{
                rmax=Math.max(height[r],rmax);
                area+=rmax-height[r];
                r--;
            }
        }
        return area;
    }
}
