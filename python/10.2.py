class Solution:
    def maxBottlesDrunk(self, numBottles: int, numExchange: int) -> int:
        full = numBottles
        empty = 0
        exchange = numExchange
        drunk = 0

        while full > 0 or empty >= exchange:
            # 喝掉所有满瓶
            if full > 0:
                drunk += full
                empty += full
                full = 0

            # 尝试兑换
            if empty >= exchange:
                full += 1
                empty -= exchange
                exchange += 1
            else:
                break

        return drunk