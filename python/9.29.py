class Solution:
    def minScoreTriangulation(self, values):
        n = len(values)
        # dp[i][j] 表示从顶点 i 到 j 的子多边形的最小得分
        dp = [[0] * n for _ in range(n)]

        # 枚举区间长度：从 2 开始（至少三个点才能形成三角形）
        for length in range(2, n):  # 区间长度为 length+1 个点
            for i in range(n - length):
                j = i + length
                dp[i][j] = float('inf')
                # 枚举中间点 k
                for k in range(i + 1, j):
                    cost = dp[i][k] + dp[k][j] + values[i] * values[k] * values[j]
                    dp[i][j] = min(dp[i][j], cost)

        return dp[0][n - 1]