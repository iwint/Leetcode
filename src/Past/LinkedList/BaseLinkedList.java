package Past.LinkedList;

public class BaseLinkedList {

    Node head;

    public void insertAtFront(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtBack(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
        }
    }

    public void printAllElements() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public int getLastValue() {
        Node temp = head;

        if (temp == null) {
            return -1;
        }

        while (temp.next != null) {
            temp = temp.next;
        }

        return temp.value;

    }

    public int getHeadValue() {
        if (head == null) return -1;
        return head.value;
    }

    public void insertValueAt(int value, int index) {

        Node newNode = new Node(value);
        Node current = head;
        int count = 1;

        if (head == null) {
            head = newNode;
            return;
        }

        while (current.next != null) {

            if (count == index) {
                newNode.next = current.next;
                current.next = newNode;
            }

            current = current.next;
            count++;

        }

    }
}
