def remove_duplicates(nums: list[int]) -> int:
    k = 0
    for num in nums:
        if k < 2 or num != nums[k - 2]:
            nums[k] = num
            k += 1
    return k

print(remove_duplicates([0, 0, 1, 1, 1, 1, 2, 3, 3]))
