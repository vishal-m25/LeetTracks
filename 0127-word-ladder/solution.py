class Solution(object):
    def ladderLength(self, beginWord, endWord, wordList):
        q = deque()
        q.append((beginWord,1))
        hmap = defaultdict(int)
        for word in wordList: hmap[word] = 1
        hmap[beginWord] = 0
        while( len(q) > 0 ):
            word = q.popleft()
            wordl = list(word[0])
            if( word[1] > 1 and word[0] == endWord):
                return word[1]
            for i in range(0,len(wordl)):
                t = wordl[i]
                for j in range(0,ord('z')-ord('a') + 1):
                    wordl[i] = chr( ord('a') + j )
                    tword = ''.join(wordl)
                    if( hmap[tword] == 1 and tword != word[0] ):
                        q.append( (tword,word[1]+1) )
                        hmap[tword] = 0
                wordl[i] = t
                    
        return 0

            
