def third_max_num(nums: list[int]) -> int:
    sorted_nums: list[int] = list(set(nums)) or nums
    sorted_nums.sort(reverse=True)
    print(sorted_nums)
    return sorted_nums[2] if len(sorted_nums) > 2 else sorted_nums[0]


print(third_max_num([1, 2, 3]))
