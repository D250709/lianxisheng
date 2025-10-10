from typing import List


class Solution:
    def maximumEnergy(self, energy: List[int], k: int) -> int:
        n = len(energy)
        # dp[i] 表示从位置 i 开始，按 k 步跳到末尾的最大能量
        dp = [0] * n

        # 从后往前遍历
        for i in range(n - 1, -1, -1):
            next_pos = i + k
            if next_pos < n:
                dp[i] = energy[i] + dp[next_pos]
            else:
                dp[i] = energy[i]  # 只能走一步

        return max(dp)