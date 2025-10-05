from collections import deque
from typing import List


class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        if not heights or not heights[0]:
            return []

        m, n = len(heights), len(heights[0])
        # 标记能流到太平洋和大西洋的格子
        pacific = [[False] * n for _ in range(m)]
        atlantic = [[False] * n for _ in range(m)]

        # 方向：上、下、左、右
        directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]

        # BFS 函数：从边界开始，逆向扩散
        def bfs(start_queue, ocean):
            queue = deque(start_queue)
            while queue:
                i, j = queue.popleft()
                if ocean[i][j]:
                    continue
                ocean[i][j] = True
                for di, dj in directions:
                    ni, nj = i + di, j + dj
                    if 0 <= ni < m and 0 <= nj < n and not ocean[ni][nj]:
                        # 只有当邻居高度 >= 当前格子高度时，才能从海洋“逆流”过来
                        if heights[ni][nj] >= heights[i][j]:
                            queue.append((ni, nj))

        # 初始化太平洋边界（第一行和第一列）
        pacific_queue = []
        for j in range(n):
            pacific_queue.append((0, j))  # 第一行
        for i in range(1, m):
            pacific_queue.append((i, 0))  # 第一列
        bfs(pacific_queue, pacific)

        # 初始化大西洋边界（最后一行和最后一列）
        atlantic_queue = []
        for j in range(n):
            atlantic_queue.append((m - 1, j))  # 最后一行
        for i in range(m - 1):
            atlantic_queue.append((i, n - 1))  # 最后一列
        bfs(atlantic_queue, atlantic)

        # 收集结果：既能流到太平洋又能流到大西洋
        result = []
        for i in range(m):
            for j in range(n):
                if pacific[i][j] and atlantic[i][j]:
                    result.append([i, j])

        return result