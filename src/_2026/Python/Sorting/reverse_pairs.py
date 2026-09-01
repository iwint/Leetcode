def reverse_pairs(nums: list[int]):

    counter = 0
    n = len(nums)

    for i in range(n):
        for j in range(i + 1, n):
            if nums[i] > (2 * nums[j]):
                counter += 1

    return counter


def reverse_pairs_using_merge_sort(nums: list[int], l: int, h: int):

    if l >= h:
        return 0

    mid = l + (h - l) // 2
    count = 0
    count += reverse_pairs_using_merge_sort(nums, l, mid)
    count += reverse_pairs_using_merge_sort(nums, mid + 1, h)
    count += find_count(nums, l, mid, h)
    merge(nums, l, mid, h)
    return count


def merge(nums: list[int], l: int, mid: int, h: int):

    left_arr = nums[l : mid + 1]
    right_arr = nums[mid + 1 : h + 1]

    i = 0
    j = 0
    k = l

    while i < len(left_arr) and j < len(right_arr):
        if left_arr[i] < right_arr[j]:
            nums[k] = left_arr[i]
            i += 1
        else:
            nums[k] = right_arr[j]
            j += 1
        k += 1

    while i < len(left_arr):
        nums[k] = left_arr[i]
        i += 1
        k += 1

    while j < len(right_arr):
        nums[k] = right_arr[j]
        j += 1
        k += 1


def find_count(nums: list[int], l: int, mid: int, h: int):

    i = l
    j = mid + 1
    count = 0

    while i <= mid and j <= h:
        if nums[i] > (2 * nums[j]):
            count += mid - i + 1
            j += 1
        else:
            i += 1

    return count


nums = [1, 3, 2, 3, 1]

print(reverse_pairs_using_merge_sort(nums, 0, len(nums) - 1))
