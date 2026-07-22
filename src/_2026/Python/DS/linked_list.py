from typing import Optional, Generic, TypeVar

T = TypeVar("T")

class Node(Generic[T]):
    def __init__(self):
        self.value: Optional[T] = None
        self.next: Optional[Node] = None


class LinkedList(Generic[T]):

    def __init__(self):
        self.head: Optional[Node] = None
        self.tail: Optional[Node] = None

    def get_head(self):
        return self.head


def __init__():
    linked_list = LinkedList()
    print("Its None" if linked_list.get_head() is None else linked_list.get_head())

__init__()