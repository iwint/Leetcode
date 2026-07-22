"""
Given a sorted array and a target
if there is no target value found
we need to return the index where the target can be inserted
"""


def find_or_insert(nums: list[int], target: int) -> int:
    l = 0
    h = len(nums) - 1

    while l < h:

        mid = int(l + (h - l) / 2)

        if nums[mid] == target:
            return mid

        if nums[mid] < target:
            l = mid + 1

        if nums[mid] > target:
            h = mid - 1

    return l


"""
l = 0
r = 3

mid = 0 + 3 + 1 => 4/2 = 2 
"""

print(find_or_insert(nums=[1, 3, 5, 6], target=4))
