def count_unplaced_fruits(fruits, baskets):
    # 对篮子进行排序以便我们可以找到第一个符合条件的篮子
    baskets.sort()
    unplaced_count = 0

    for fruit in fruits:
        placed = False
        for i, basket in enumerate(baskets):
            if basket >= fruit:
                # 找到合适的篮子后移除它以防止再次使用
                del baskets[i]
                placed = True
                break

        if not placed:
            unplaced_count += 1

    return unplaced_count


# 示例测试
fruits1 = [4, 2, 5]
baskets1 = [3, 5, 4]
print(count_unplaced_fruits(fruits1, baskets1))  # 输出: 1

fruits2 = [3, 6, 1]
baskets2 = [6, 4, 7]
print(count_unplaced_fruits(fruits2, baskets2))  # 输出: 0



