class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=1,c=1;
        if(s.length()==0){return 0;}
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length()-1;j++){
                if (!(s.substring(i, j).contains(String.valueOf(s.charAt(j))))){
                    c+=1;
                }
                else{break;}
            }
            if (max<c){max=c;}
            c=1;
        }
        return max;
    }
}
