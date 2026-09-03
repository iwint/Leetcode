def find_kth_largest(nums: list[int], k: int) -> int:

    l = 0
    h = len(nums) - 1
    target = len(nums) - k

    while l < h:

        pivot_index = partition(nums, l, h)

        if target <= pivot_index:
            h = pivot_index
        else:
            l = pivot_index + 1

    return nums[l]


def partition(nums: list[int], l: int, h: int) -> int:

    pivot = nums[(l + h)//2]
    i = l - 1
    j = h + 1

    while True:

        i += 1

        while nums[i] < pivot:
            i += 1

        j -= 1
        while nums[j] > pivot:
            j -= 1

        if i >= j:
            return j

        nums[i], nums[j] = nums[j], nums[i]


if __name__ == "__main__":
    nums = [3, 2, 1, 5, 6, 4]
    k = 2
    print(find_kth_largest(nums, k))
