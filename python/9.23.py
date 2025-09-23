class Solution:
    def compareVersion(self, version1: str, version2: str) -> int:
        # 将版本号字符串按点分割成修订号列表
        v1_parts = version1.split('.')
        v2_parts = version2.split('.')

        # 获取两个版本号的修订号数量
        len_v1 = len(v1_parts)
        len_v2 = len(v2_parts)

        # 确保两个版本号有相同的修订号数量，不足的补0
        max_len = max(len_v1, len_v2)
        v1_parts += ['0'] * (max_len - len_v1)
        v2_parts += ['0'] * (max_len - len_v2)

        # 逐个比较修订号
        for i in range(max_len):
            # 将修订号转换为整数进行比较
            num1 = int(v1_parts[i])
            num2 = int(v2_parts[i])

            if num1 > num2:
                return 1  # version1 大于 version2
            elif num1 < num2:
                return -1  # version1 小于 version2

        # 如果所有修订号都相等，则版本号相等
        return 0


# 示例测试
solution = Solution()
print(solution.compareVersion("1.2", "1.10"))  # 输出: -1
print(solution.compareVersion("1.01", "1.001"))  # 输出: 0
print(solution.compareVersion("1.0", "1.0.0"))  # 输出: 0