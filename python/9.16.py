from typing import List
import math


class Solution:
    def replaceNonCoprimes(self, nums: List[int]) -> List[int]:
        stack = []

        for num in nums:
            stack.append(num)
            while len(stack) >= 2 and math.gcd(stack[-1], stack[-2]) > 1:
                a = stack.pop()
                b = stack.pop()
                stack.append(a * b // math.gcd(a, b))

        return stack


# 示例测试
solution = Solution()
print(solution.replaceNonCoprimes([6, 4, 3, 2, 7, 6, 2]))  # 输出: [12, 7, 6]