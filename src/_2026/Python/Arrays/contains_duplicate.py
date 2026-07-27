def contains_duplicate(nums: list[int]):
    # temp_arr = []
    # for num in nums:
    #     if temp_arr.count(num) > 0:
    #         return True
    #     temp_arr.append(num)
    # return False

    hash_set = set(nums)
    return len(hash_set) != len(nums)


print(contains_duplicate([1, 2, 3, 1]))
