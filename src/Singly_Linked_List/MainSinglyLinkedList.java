package Singly_Linked_List;

public class MainSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.createSinglyLinkedList(5);
        list.insertIntoLinkedList(1,1);
        System.out.println(list.searchNode(1));
    }
}
