arr = [2, 4, 1, 3, 2, 3]


def quick_sort(l: int, h: int):
    if l < h:
        partition_index = partition(l, h)
        print(partition_index)
        quick_sort(l, partition_index)
        quick_sort(partition_index + 1, h)

def partition(l: int, h: int) -> int:
    pivot = arr[l]
    i = l + 1
    j = h

    while i < j:

        while arr[i] < pivot:
            i += 1

        while arr[j] > pivot:
            j -= 1

        if arr[i] > arr[j]:
            temp = arr[j]
            arr[j] = arr[i]
            arr[i] = temp

    temp = arr[j]
    arr[j] = pivot
    arr[l] = temp

    return j


quick_sort(0, len(arr) - 1)
print(arr)