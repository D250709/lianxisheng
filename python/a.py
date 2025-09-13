class Solution:
    def checkPowersOfThree(self, n: int) -> bool:
        """
        判断一个整数是否可以表示为若干个不同的三的幂之和。

        Args:
            n: 待检查的整数。

        Returns:
            如果可以表示，返回 True；否则返回 False。
        """
        while n > 0:
            remainder = n % 3
            if remainder == 2:
                return False
            n //= 3
        return True



