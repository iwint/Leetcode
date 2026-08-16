arr = [2, 4, 1, 3, 2, 3]


def quick_sort(l: int, h: int):
    if l < h:
        partition_index = partition(l, h)
        quick_sort(l, partition_index)
        quick_sort(partition_index + 1, h)


def partition(l: int, h: int) -> int:
    pivot = arr[l]
    i = l - 1
    j = h + 1

    while True:
        i +=1
        while arr[i] < pivot:
            i += 1

        j -=1
        while arr[j] > pivot:
            j -= 1

        if i >= j:
           return j

        arr[i], arr[j] = arr[j], arr[i]



quick_sort(0, len(arr) - 1)
print(arr)
