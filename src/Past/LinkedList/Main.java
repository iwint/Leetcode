package Past.LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BaseLinkedList list = new BaseLinkedList();
        OptimalLinkedList list = new OptimalLinkedList();
        Scanner I = new Scanner(System.in);

        int n = I.nextInt();

//        int value = I.nextInt();
//        int index = I.nextInt();

        for(int i=0; i < n; i++){
            list.insertAtEnd(I.nextInt());
        }
//        list.insertValueAt(value,index);
        list.printAllElements();

    }
}


