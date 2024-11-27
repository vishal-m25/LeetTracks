class Solution {
    public int longestSubstring(String s, int k) {
        int uniqueSize = getUniqueCharsSize(s);
        int ans = 0;

        for (int maxUniques = 1; maxUniques <= uniqueSize; maxUniques++){
            int uniques = 0;
            int left = 0;
            int[] freq = new int[26];
            
            for (int i = 0; i < s.length(); i++){
                int ch = s.charAt(i) - 'a';

                if (freq[ch] == 0){
                    uniques += 1;
                }
                
                freq[ch] += 1;

                while (left < i && uniques > maxUniques){
                    int ch_left = s.charAt(left) - 'a';
                    
                    freq[ch_left] -= 1;

                    if (freq[ch_left] == 0){
                        uniques -= 1;
                    }

                    left++;
                }

                if (is_valid_str(freq, k))
                    ans = Math.max(ans, i - left + 1);
            }
        }
        return ans;
    }
    
    int getUniqueCharsSize(String s){
        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()){
            set.add(c);
        }

        return set.size();
    }

    boolean is_valid_str(int[] freq, int k){
        for (int f : freq){
            if (f == 0) continue;

            if (f < k) 
                return false;
        }
        return true;
    }
}
