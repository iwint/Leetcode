from typing import Optional, Generic, TypeVar

T = TypeVar("T")


class Node(Generic[T]):
    def __init__(self, value, next):
        self.value: Optional[T] = value
        self.next: Optional[Node] = next


class LinkedList(Generic[T]):
    def __init__(self):
        self.head: Optional[Node] = None
        self.tail: Optional[Node] = None
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

    def display(self):

        current = self.head

        while current is not None:
            print(current.value)
            current = current.next
            self.size += 1

    def size_of(self):
        return self.size


def __init__():
    linked_list = LinkedList()
    linked_list.create([1, 2, 3, 4, 5])
    print(linked_list.size_of())

__init__()
