class Solution 
{
    public boolean canMeasureWater(int x, int y, int k) 
    {
        return k == 0 || (x + y >= k && k % gcd(x, y) == 0);
    }
    private int gcd(int a, int b)
    {
        return b == 0 ? a : gcd(b, a % b);
    }
}
