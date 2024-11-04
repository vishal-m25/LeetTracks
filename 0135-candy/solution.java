class Solution {
    public int candy(int[] r) {
        int n=r.length;
        int []m1= new int[n];
        int[] m2=new int[n];
        for(int i=0;i<n;i++){
            m1[i]=1;
            m2[i]=1;
        }
        for(int i=1;i<n;i++){
            if(r[i]>r[i-1]){
                m1[i]=m1[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(r[i]>r[i+1]){
                m2[i]=m2[i+1]+1;
            }
        }

        int t=0;
        for(int i=0;i<n;i++){
            t+=Math.max(m1[i],m2[i]);
        }
        return t;
    }
}
