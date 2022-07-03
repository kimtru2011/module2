package ss9_DSAList.thuc_hanh.LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(110);
        ll.addFirst(15);
        ll.addFirst(13);

        ll.add(1,9);
        ll.add(4,9);
        ll.printList();
    }
}
