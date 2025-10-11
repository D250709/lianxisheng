from collections import Counter
from typing import List


class Solution:
    def maximumTotalDamage(self, power: List[int]) -> int:
        # 统计每个伤害值的频次
        count = Counter(power)
        # 获取所有唯一的伤害值并排序
        values = sorted(count.keys())

        # dp[i] 表示考虑前 i 个伤害值时的最大伤害
        dp = [0] * (len(values) + 1)

        for i, x in enumerate(values):
            # 不选 x
            dp[i + 1] = dp[i]
            # 选 x
            # 找到最小的 j，使得 values[j] >= x - 2
            # 我们需要找到最后一个不与 x 冲突的值
            # 冲突范围：[x-2, x+2]
            # 所以，我们要找最大的 j，使得 values[j] < x-2
            # 然后 dp[i+1] = max(dp[i+1], dp[j+1] + count[x] * x)

            # 二分查找或线性查找
            j = i - 1
            while j >= 0 and values[j] >= x - 2:
                j -= 1
            # j 是最后一个不与 x 冲突的值的索引
            # 所以 dp[i+1] = max(dp[i+1], dp[j+1] + count[x] * x)
            dp[i + 1] = max(dp[i + 1], dp[j + 1] + count[x] * x)

        return dp[len(values)]