class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long s=0;
        for(int i:chalk){
            s+=i;
        }
        int i=0;
        k%=s;
        while(k>=0){
            k-=chalk[i];
                i++;
        }
        return i-1;
        
    }
}
