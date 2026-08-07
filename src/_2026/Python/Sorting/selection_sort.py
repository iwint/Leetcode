def selection_sort(nums: list[int]):
    for i in range(0, len(nums)):
        min_value = nums[i]
        for j in range(i, len(nums)):
            if nums[j] < min_value:
                temp = min_value
                min_value = nums[j]
                nums[j] = temp
        nums[i] = min_value

    return nums

print(selection_sort([10, 4, 3, 2, 8]))
