class Solution(object):
    def minimumBoxes(self, apple, capacity):
        """
        :type apple: List[int]
        :type capacity: List[int]
        :rtype: int
        """
        apples = sum(apple)
        capSort = list(reversed(sorted(capacity)))
        space = 0
        output = 0
        for i in capSort:
            output += 1
            space += i
            if space >= apples:
                return output
        return 0
