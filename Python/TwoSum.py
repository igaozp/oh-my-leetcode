class Solution(object):
    def twoSum(self, nums, target):
        for indexI, i in enumerate(nums):
            for indexJ, j in enumerate(nums):
                if indexI is not indexJ:
                    if target is (i + j):
                        return indexI, indexJ
