class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.length() != t.length()) {
            return false;
        }

        unordered_map<char, int> c;

        for (char ch : s) {
            c[ch] = c[ch] + 1;
        }

        for (char ch : t) {
            if (c.find(ch) == c.end() || c[ch] == 0) {
                return false;
            }
            c[ch] -= 1;
        }

        return true;        
    }
};
