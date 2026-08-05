def majority_elements_with_threshold(nums: list[int]):
    n = len(nums)
    threshold = int(n // 3)

    hash_map = {}

    for num in nums:
        hash_map[num] = hash_map.get(num, 0) + 1

    repeated_nums = []

    for num, count in hash_map.items():

        if count > threshold:
            repeated_nums.append(num)

    return repeated_nums
