class Solution {
    
    int countDigits(int n) {
        if(n == 0) return 0;
        return n%10 + countDigits(n/10);
    }
    
    public int countLargestGroup(int n) {
        
        ArrayList<Integer> list = new ArrayList(Collections.nCopies(37, 0));
        
        for(int i=1;i<=n;i++) {
            int cd = countDigits(i); 
            list.set(cd, list.get(cd)+1); 
        }
        
        return Collections.frequency(list, Collections.max(list));
    }
}
