class Solution:
    def maxFreqSum(self, s: str) -> int:
        vowels = {'a', 'e', 'i', 'o', 'u'}
        vowel_freq = {}
        consonant_freq = {}

        for char in s:
            if char in vowels:
                vowel_freq[char] = vowel_freq.get(char, 0) + 1
            else:
                consonant_freq[char] = consonant_freq.get(char, 0) + 1

        max_vowel_freq = max(vowel_freq.values(), default=0)
        max_consonant_freq = max(consonant_freq.values(), default=0)

        return max_vowel_freq + max_consonant_freq


# 示例测试
solution = Solution()
print(solution.maxFreqSum("successes"))  # 输出: 6
print(solution.maxFreqSum("aeiaeiia"))  # 输出: 5