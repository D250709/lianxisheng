import heapq


def minimumDifference(nums):
    n = len(nums) // 3

    # Max heap for the first part (maximize the smallest in the max heap)
    max_heap_first_part = []
    min_sum_first_part = [0] * (2 * n + 1)

    # Min heap for the second part (minimize the largest in the min heap)
    min_heap_second_part = nums[2 * n:].copy()
    heapq.heapify(min_heap_second_part)
    max_sum_second_part = sum(min_heap_second_part)
    min_diff = float('inf')

    # Calculate prefix sums for the first part using a max heap
    for i in range(n):
        heapq.heappush(max_heap_first_part, -nums[i])
    min_sum_first_part[n] = -sum(max_heap_first_part)

    for i in range(n, 2 * n):
        heapq.heappush(max_heap_first_part, -nums[i])
        num_to_remove_from_max_heap = -heapq.heappop(max_heap_first_part)
        min_sum_first_part[i + 1] = min_sum_first_part[i] + nums[i] - num_to_remove_from_max_heap

    # Calculate suffix sums for the second part using a min heap and find the minimum difference
    for i in range(2 * n - 1, n - 1, -1):
        num_to_remove_from_min_heap = heapq.heappop(min_heap_second_part)
        max_sum_second_part -= num_to_remove_from_min_heap
        if i < 2 * n:
            heapq.heappush(min_heap_second_part, nums[i])
            max_sum_second_part += nums[i]
        min_diff = min(min_diff, min_sum_first_part[i + 1] - max_sum_second_part)

    return min_diff


# 示例测试
print(minimumDifference([3, 1, 2]))  # 输出: -1
print(minimumDifference([7, 9, 5, 8, 1, 3]))  # 输出: 1



