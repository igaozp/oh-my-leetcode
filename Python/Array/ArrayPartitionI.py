class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        result = 0
        nums = sorted(nums)
        for i in range(0, len(nums), 2):
            result += min(nums[i], nums[i + 1])
        return result