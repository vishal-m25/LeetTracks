class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int num: map.keySet()) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
