def find_kth_largest(nums: list[int], l: int, h: int, k: int) -> int:

    if l < h:
        partition_index = partition(nums, l, h)
        find_kth_largest(nums, l, partition_index, k)
        find_kth_largest(nums, partition_index + 1, h, k)

    return -1


def partition(nums: list[int], l: int, h: int) -> int:

    pivot = nums[l]
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
    print(find_kth_largest(nums, 0, len(nums)-1, k))
