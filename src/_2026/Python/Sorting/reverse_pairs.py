def reverse_pairs(nums: list[int]):

    counter = 0
    n = len(nums)

    for i in range(n):
        for j in range(i + 1, n):
            if nums[i] > (2 * nums[j]):
                counter += 1

    return counter


print(reverse_pairs(nums=[1, 3, 2, 3, 1]))
