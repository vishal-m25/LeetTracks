class Solution {
    public int titleToNumber(String columnTitle) {
        char a[]=columnTitle.toCharArray();
        int s=0,j=0;
        for(int i=0;i<a.length;i++){
            s=(s*26)+(a[i]-64);
        }
        return s;
    }
}
