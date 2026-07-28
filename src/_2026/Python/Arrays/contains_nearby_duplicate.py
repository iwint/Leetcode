def contains_nearby_duplicate(nums: list[int], k: int) -> bool:
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] == nums[j] == k:
                if abs(i - j) <= k:
                    return True
                else:
                    return False

    return False


print(contains_nearby_duplicate([1, 2, 3, 1, 2, 3], 3))
