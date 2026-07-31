def shuffle_arr(nums: list[int], n: int):
    new_arr = []

    for i in range(n):
        new_arr.append(nums[i])
        new_arr.append(nums[i + n])

    return new_arr


print(shuffle_arr([2, 5, 1, 3, 4, 7], 3))
