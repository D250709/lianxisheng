from typing import List


class Solution:
    def minimumTeachings(self, n: int, languages: List[List[int]], friendships: List[List[int]]) -> int:
        # 将语言列表转换为集合，方便查找
        lang_sets = [set(lang) for lang in languages]

        # 找出不能直接沟通的好友对
        need_teach = set()
        for u, v in friendships:
            if not lang_sets[u - 1].intersection(lang_sets[v - 1]):
                need_teach.add(u - 1)
                need_teach.add(v - 1)

        # 如果所有好友都能直接沟通，不需要教任何语言
        if not need_teach:
            return 0

        # 统计每种语言在需要教的好友中的出现次数
        lang_count = [0] * (n + 1)
        for i in need_teach:
            for lang in lang_sets[i]:
                lang_count[lang] += 1

        # 选择出现次数最多的语言进行教学
        max_lang_count = max(lang_count)

        # 计算需要教的人数
        return len(need_teach) - max_lang_count


# 示例测试
sol = Solution()
print(sol.minimumTeachings(2, [[1], [2], [1, 2]], [[1, 2], [1, 3], [2, 3]]))  # 输出: 1
print(sol.minimumTeachings(3, [[2], [1, 3], [1, 2], [3]], [[1, 4], [1, 2], [3, 4], [2, 3]]))  # 输出: 2