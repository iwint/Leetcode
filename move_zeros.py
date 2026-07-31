def move_zeros(nums: list[int]):
    insert_pos = 0

    for i in range(len(nums)):
        if nums[i] != 0:
            if i != insert_pos:
                nums[insert_pos] = nums[i]
                nums[i] = 0
            insert_pos += 1

    return nums


print(move_zeros([1, 0, 3, 0, 12]))
