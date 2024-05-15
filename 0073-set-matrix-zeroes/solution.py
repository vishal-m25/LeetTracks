class Solution(object):
    def setZeroes(self, matrix):
        ll=[]
        for i,j in enumerate(matrix):
            try:
                c=0
                while c<len(matrix[0]):
                    index = j.index(0, c)
                    ll.append((i, index))
                    c = index + 1      
            except:
                continue
        for i in ll:
            matrix[i[0]]=[0]*len(matrix[0])
            for j in range(len(matrix)):
                matrix[j][i[1]]=0

    
