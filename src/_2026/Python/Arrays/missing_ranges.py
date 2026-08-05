def missing_ranges(nums: list[int], l: int, h: int) -> list[list[int]]:
    result: list[list[int]] = []

    for i in range(len(nums)):

        if ((i + 1) < len(nums)) and (nums[i + 1] - nums[i]) > 0:
            result.append([(nums[i] + 1), (nums[i + 1] - 1)])
        else:
            result.append([(nums[i] + 1), h])

    return result


print(missing_ranges([0, 1, 3, 50, 75], 0, 99))
