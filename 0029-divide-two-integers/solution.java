class Solution {
    public int divide(int dividend, int divisor) {
        int i=0;
        if (dividend==-2147483648 && divisor==-1)
        return 2147483647;
        if (dividend==-2147483648 && divisor==1)
        return -2147483648;
        else
        return dividend/divisor;

    }
}
