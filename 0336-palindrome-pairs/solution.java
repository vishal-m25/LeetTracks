public class Solution {
    class TrieNode {
        public TrieNode[] next;
        public int index;
        public List<Integer> list;
        
        public TrieNode() {
            index = -1;
            next = new TrieNode[26];
            list = new ArrayList<>();
        }
    }
    public void addWord(TrieNode root, String word, int wordIdx) {
        for (int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i);
            if (root.next[c - 'a'] == null) {
                root.next[c - 'a'] = new TrieNode();
            }
            if(isPalindrome(word, 0, i)) root.list.add(wordIdx);
            root = root.next[c - 'a'];
        }
        
        root.index = wordIdx;
    }
    public List<List<Integer>> search(TrieNode root, String word, int wordIdx) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (root.index != -1 && wordIdx != root.index && isPalindrome(word, i, word.length() - 1)) {
                res.add(Arrays.asList(wordIdx, root.index));
            }
            
            char c = word.charAt(i);
            root = root.next[c - 'a'];
            if (root == null) return res;
        }
        if (root.index != wordIdx && root.index != -1) {
            res.add(Arrays.asList(wordIdx, root.index));
        }
        for (Integer k : root.list) {
            res.add(Arrays.asList(wordIdx, k));
        }
        
        return res;
    }
    
    private boolean isPalindrome(String word, int s, int e) {
        while(s < e && word.charAt(s) == word.charAt(e)) {
            s++;
            e--;
        }
        
        return s >= e;
    }
    public List<List<Integer>> palindromePairs(String[] words) {
        TrieNode root = new TrieNode();
        

        for(int i = 0; i < words.length; i++) {
            addWord(root, words[i], i);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            res.addAll(search(root, words[i], i));
        }
        
        return res;
    }
}
