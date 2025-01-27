package Past.LinkedList;

public class OptimalLinkedList {
    private Node head;
    private Node tail;

    public void insertAtEnd(int value){

        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void printAllElements(){
        Node current = head;
        while (current!=null){
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

}
