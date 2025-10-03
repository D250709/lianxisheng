import heapq
from typing import List


class Solution:
    def trapRainWater(self, heightMap: List[List[int]]) -> int:
        if not heightMap or not heightMap[0]:
            return 0

        m, n = len(heightMap), len(heightMap[0])
        visited = [[False] * n for _ in range(m)]
        heap = []

        # 将所有边界点加入堆
        directions = [(0, 1), (0, -1), (1, 0), (-1, 0)]

        # 加入第一行和最后一行
        for j in range(n):
            heapq.heappush(heap, (heightMap[0][j], 0, j))
            heapq.heappush(heap, (heightMap[m - 1][j], m - 1, j))
            visited[0][j] = True
            visited[m - 1][j] = True

        # 加入第一列和最后一列（排除角落重复）
        for i in range(1, m - 1):
            heapq.heappush(heap, (heightMap[i][0], i, 0))
            heapq.heappush(heap, (heightMap[i][n - 1], i, n - 1))
            visited[i][0] = True
            visited[i][n - 1] = True

        total_water = 0

        while heap:
            h, i, j = heapq.heappop(heap)

            for di, dj in directions:
                ni, nj = i + di, j + dj
                if 0 <= ni < m and 0 <= nj < n and not visited[ni][nj]:
                    visited[ni][nj] = True
                    new_height = heightMap[ni][nj]
                    # 当前点的水位是 h，如果新点比 h 低，则能存水
                    water_here = max(0, h - new_height)
                    total_water += water_here

                    # 下一次进入时，水位至少是 max(h, new_height)
                    heapq.heappush(heap, (max(h, new_height), ni, nj))

        return total_water