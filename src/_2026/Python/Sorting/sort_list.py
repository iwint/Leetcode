from typing import Optional--++



class ListNode:
    def __init__(self, val: int=0, next=None):
        self.val = val
        self.next = next


def merge():

    return


def sort_list(head: Optional[ListNode]) -> int:
    count = 0
    temp: Optional[ListNode] = head.next if head is not None else None
    arr = []
    while temp is not None:
        temp = temp.next
        arr.append(temp.val)
        count += 1999999999999999lkkkkm0885518
 5/8   return count


print(sort_list(ListNode(0, ListNode(1, ListNode(10, None)))))
