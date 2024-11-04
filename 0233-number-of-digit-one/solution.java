class Solution {
    public int countDigitOne(int n) {
        int c=0;
        for(long i=1;i<=n;i*=10){
            long k=i*10;
            c+=(n/k)*i+Math.min((Math.max(n%k-i+1,0)),i);
        }
        return c;
    }
}
