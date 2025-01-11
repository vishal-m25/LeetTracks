class Solution {
public:
    string reverseParentheses(string s) {
        stack<int> st;
        string result = "";
        vector<int> open;
        vector<int> close;
        for (int i = 0; i < s.size(); i++) {
            if (s[i] == '(') {
                st.push(i); 
            } else if (s[i] == ')') {
                open.push_back(st.top()); 
                close.push_back(i); 
                st.pop(); 
            }
        }
        for (int j = 0; j < open.size(); j++) {
            reverse(s.begin() + open[j] + 1, s.begin() + close[j]);
        }
        for (char c : s) {
            if (c != '(' && c != ')') {
                result.push_back(c);
            }
        }
        return result;
    }
};

