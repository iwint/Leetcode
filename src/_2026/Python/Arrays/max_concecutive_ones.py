def max_consecutive_ones(nums: list[int]) -> int:
    max_count = 0
    count = 0

    for i in range(len(nums)):

        if nums[i] == 1:
            count += 1


        if nums[i] == 0:
            count = 0

        max_count = max(count, max_count)

    return max_count


print(max_consecutive_ones([1, 0, 1, 1]))
