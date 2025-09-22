from typing import List
from collections import Counter


class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        # 使用Counter计算每个元素的频率
        freq = Counter(nums)

        # 找到最大的频率
        max_freq = max(freq.values(), default=0)

        # 计算具有最大频率的元素的总数量
        count = sum(1 for num in freq if freq[num] == max_freq)

        return count * max_freq


# 示例测试
solution = Solution()
print(solution.maxFrequencyElements([1, 2, 2, 3, 1, 4]))  # 输出: 4
print(solution.maxFrequencyElements([1, 2, 3, 4, 5]))  # 输出: 5