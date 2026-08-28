from typing import Generic, TypeVar

T = TypeVar("T")


class Node(Generic[T]):
    def __init__(self, value, next):
        self.value: T = value
        self.next = next


class LinkedList(Generic[T]):
    def __init__(self):
        self.head = None
        self.tail = None
        self.size: int = 0

    def get_head(self):
        return self.head

    def create(self, nums: list[int]):

        self.head = Node(nums[0], None)
        last = self.head

        for i in range(1, len(nums)):
            t = Node(nums[i], None)
            last.next = t
            last = t

        self.tail = last

    def display(self, is_skip_print: bool = False):

        current = self.head
        count = 0

        while current is not None:
            if is_skip_print is False:
                print(current.value, end=" => " if current.next is not None else None)
            else:
                count += 1
            current = current.next

        self.size = count

    def size_of(self):
        self.display(is_skip_print=True)
        return self.size

    def quick_sort(self, l: int, h: int):
        if l < h:
            partition_index = self._partition(l, h)
            self.sort(l, partition_index)
            self.sort(partition_index + 1, h)

    def merge_sort(self, head):

        if not head or not head.next:
            return head

        middle_node = self.find_middle(head)
        right_head = middle_node.next
        middle_node.next = None

        left_head = self.merge_sort(head)
        right_head = self.merge_sort(right_head)
        return self._merge(left_head, right_head)

    def _merge(self, left, right):

        head = Node(-1, None)
        tail = head

        while left and right:
            if left.value <= right.value:
                tail.next = left
                left = left.next
            else:
                tail.next = right
                right = right.next

            tail = tail.next

        tail.next = left if left else right

        return head.next

    def find_middle(self, head):

        slow = head
        fast = head.next

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        return slow

    def _partition(self, l: int, h: int) -> int:
        pivot = self.get_value(l)
        i = l - 1
        j = h + 1

        while True:
            i += 1
            while self.get_value(i) < pivot:
                i += 1

            j -= 1
            while self.get_value(j) > pivot:
                j -= 1

            if i >= j:
                return j

            self._swap(i, j)

    def get_value(self, index: int) -> T:
        current = self.head
        count = 0

        while count is not index:
            current = current.next
            count += 1

        return current.value if current is not None else current

    def set_value(self, index: int, value: int):

        current = self.head
        count = 0
        while count is not index:
            current = current.next
            count += 1

        current.value = value

    def _get_node(self, index: int) -> Node:
        current = self.head
        count = 0

        while count is not index:
            current = current.next
            count += 1

        return current

    def _swap(self, i: int, j: int):
        first_node = self._get_node(i)
        second_node = self._get_node(j)
        temp = first_node.value
        first_node.value = second_node.value
        second_node.value = temp


def __init__():
    linked_list = LinkedList()
    linked_list.create([2, 4, 1, 3, 2, 3])
    # print(f"Size: {linked_list.size_of()}")
    # print(f"Head: {linked_list.head.value}")
    head = linked_list.merge_sort(linked_list.head)
    linked_list.head = head
    linked_list.display()


__init__()
