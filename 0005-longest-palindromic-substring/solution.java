class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1)
        return s;
        int n=1;
        String ss=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=i+n;j<=s.length();j++){
                if(j-i>n && pal(s.substring(i,j))){
                    n=j-i;
                    ss=s.substring(i,j);
                }
            }
        }
        return ss;
    }
    boolean pal(String a){
        int l=0;
        int r=a.length()-1;
        while(l<r){
            if (a.charAt(l) != a.charAt(r))
            return false;
            l++;
            r--;
        }
        return true;
    }
}
