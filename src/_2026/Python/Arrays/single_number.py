def single_number(nums: list[int]) -> int:
    if len(nums) == 1: return nums[0]

    dic = {}
    for num in nums:
        dic[num] = dic.get(num, 0) + 1

    for num, count in dic.items():
        if count == 1:
            return num

    return -1


print(single_number([2, 2, 1]))
