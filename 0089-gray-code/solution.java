class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ar=new ArrayList<>();
        int num = 0;
        for (int i = 0; i < (1 << n); i++) {
            num ^= i & (-i);
            ar.add(num);
        }
        return ar;
    }
}
