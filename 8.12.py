def productQueries(n, queries):
    MOD = 10 ** 9 + 7

    # Step 1: Find the powers array
    powers = []
    power = 1
    while n > 0:
        if n % 2 == 1:
            powers.append(power)
        n //= 2
        power *= 2

    # Step 2: Compute the prefix products for efficient range product calculation
    prefix_products = [1] * (len(powers) + 1)
    for i in range(len(powers)):
        prefix_products[i + 1] = (prefix_products[i] * powers[i]) % MOD

    # Step 3: Answer each query using the prefix products
    answers = []
    for left, right in queries:
        product = (prefix_products[right + 1] * pow(prefix_products[left], MOD - 2, MOD)) % MOD
        answers.append(product)

    return answers


# 示例用法
n = 15
queries = [[0, 1], [2, 2], [0, 3]]
print(productQueries(n, queries))  # 输出: [2, 4, 64]



