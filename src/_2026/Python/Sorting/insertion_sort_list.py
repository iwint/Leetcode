from typing import Optional
from sort_list import ListNode


def sort_list_by_insertion_sort(head: Optional[ListNode]) -> Optional[ListNode]:
    if not head or not head.next:
        return head

    sorted = None

    current = head

    while head:

        next_node = current.next
        if not sorted or current.val < sorted.val:

            current.next = sorted
            sorted = current

        else:

            key = sorted
            while key.next and key.next.val < current.val:
                key = key.next

            current = current.next
            key.next = current

        current = next_node

    return sorted
