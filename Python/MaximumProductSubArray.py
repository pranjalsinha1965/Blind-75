from typing import List 
class Solution: 
    def maxProduct(self, nums: List[int]) -> int: 
        res = max(nums)
        mx, mn = 1, 1
        for i in nums: 
            temp = mx*i
            mx = max(temp, mn*i, i)
            mn = min(temp, mn*i, i)
            res = max(res, mx)
        return res 