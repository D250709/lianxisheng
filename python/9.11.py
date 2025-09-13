class Solution:
    def sortVowels(self, s: str) -> str:
        # 定义元音字母集合
        vowels = set('aeiouAEIOU')

        # 提取所有的元音字母并按ASCII值排序
        vowel_list = sorted([char for char in s if char in vowels])

        # 初始化结果字符串和元音索引
        result = []
        vowel_index = 0

        # 遍历原始字符串，构建结果字符串
        for char in s:
            if char in vowels:
                result.append(vowel_list[vowel_index])
                vowel_index += 1
            else:
                result.append(char)

        return ''.join(result)


# 示例测试
solution = Solution()
print(solution.sortVowels("lEetcOde"))  # 输出: "lEOtcede"