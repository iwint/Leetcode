def bubble_sort(nums: list[int]) -> list[int]:
    n = len(nums)
    for i in range(0, n - 2):
        swapped = False

        for j in range(0, n - i - 1):

            if nums[j] > nums[j + 1]:
                temp = nums[j]
                nums[j] = nums[j + 1]
                nums[j + 1] = temp
                swapped = True

        if swapped == False:
            return nums

    return nums


print(bubble_sort([1, 4, 0, 2, 5, 6]))
