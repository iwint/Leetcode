def majority_element(nums: list[int]) -> int:
    dic = {}

    for num in nums:
        dic[num] = dic.get(num, 0) + 1

    max_repeated_num = nums[0]
    for num, count in dic.items():
        if count > dic[max_repeated_num]:
            max_repeated_num = num

    return max_repeated_num


print(majority_element([3, 2, 3]))
