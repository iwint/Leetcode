def shell_sort(nums: list[int]):
    n = len(nums)
    gap = n // 2

    while gap > 0:

        for i in range(gap, len(nums)):
            key = nums[i]
            j = i

            while j >= gap and nums[j - gap] > key:
                nums[j] = nums[j - gap]
                j = j - gap

            nums[j] = key

        gap = gap // 2

    return nums


print(shell_sort([5, 4, 3, 2, 1]))
