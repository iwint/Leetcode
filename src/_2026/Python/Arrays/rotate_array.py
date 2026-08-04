def rotate_array(nums: list[int], k: int) -> None:
    """First Approach"""
    # temp = nums[(len(nums) - k):] + nums[:len(nums) - k]
    # for i in range(len(temp)):
    #     nums[i] = temp[i]
    """Second Approach"""
    # nums.reverse()
    # for i in range(k):
    #     temp = nums[0]
    #     nums.remove(temp)
    #     nums.append(temp)
    #
    # nums.reverse()
    print(nums[0])


rotate_array([-1, -100, 3, 99], 2)
