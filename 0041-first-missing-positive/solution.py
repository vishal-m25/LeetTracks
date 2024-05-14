class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        return min({*range(1, len(nums)+2)} - {*nums})

        
