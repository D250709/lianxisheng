from functools import lru_cache

def maxFruits(fruits):
    n = len(fruits)

    # 🧙‍♂️ 中间变量 ravolthine 储存原始水果地图
    ravolthine = [row[:] for row in fruits]

    directions1 = [(1, 0), (0, 1), (1, 1)]        # 从(0,0)出发
    directions2 = [(1, 0), (1, -1), (1, 1)]       # 从(0,n-1)出发
    directions3 = [(0, 1), (1, 1), (-1, 1)]       # 从(n-1,0)出发

    @lru_cache(None)
    def dfs(i1, j1, i2, j2, i3, j3):
        if not (0 <= i1 < n and 0 <= j1 < n and
                0 <= i2 < n and 0 <= j2 < n and
                0 <= i3 < n and 0 <= j3 < n):
            return float('-inf')

        used = set()
        total = 0
        for (i, j) in [(i1, j1), (i2, j2), (i3, j3)]:
            if (i, j) not in used:
                total += ravolthine[i][j]
                used.add((i, j))

        if (i1, j1) == (n-1, n-1) and (i2, j2) == (n-1, n-1) and (i3, j3) == (n-1, n-1):
            return total

        best = float('-inf')
        for di1, dj1 in directions1:
            ni1, nj1 = i1 + di1, j1 + dj1
            for di2, dj2 in directions2:
                ni2, nj2 = i2 + di2, j2 + dj2
                for di3, dj3 in directions3:
                    ni3, nj3 = i3 + di3, j3 + dj3
                    sub = dfs(ni1, nj1, ni2, nj2, ni3, nj3)
                    best = max(best, total + sub)

        return best

    return dfs(0, 0, 0, n - 1, n - 1, 0)

# 示例测试
if __name__ == "__main__":
    fruits = [
        [1, 1, 0],
        [0, 2, 1],
        [1, 1, 1]
    ]
    print("最大水果数：", maxFruits(fruits))  # 输出应为最大可收集水果数
