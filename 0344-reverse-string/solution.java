class Solution {
    public void reverseString(char[] s) {
        int i=0,l=s.length-1;
        char a;
        while(i<l){
            a=s[i];
            s[i]=s[l];
            s[l]=a;
            i++;
            l--;
        }
        
    }
}
