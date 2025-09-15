class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        # 将 text 按空格分割成单词列表
        words = text.split()

        # 将 brokenLetters 转换为集合以便快速查找
        broken_set = set(brokenLetters)

        count = 0
        for word in words:
            # 检查当前单词是否包含任何损坏的字符
            if not any(letter in broken_set for letter in word):
                count += 1

        return count


# 示例测试
solution = Solution()
print(solution.canBeTypedWords("hello world", "ad"))  # 输出: 1
print(solution.canBeTypedWords("leet code", "lt"))  # 输出: 1
print(solution.canBeTypedWords("leet code", "e"))  # 输出: 0