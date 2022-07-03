package ss9_DSAList.bai_tap.Linked_List;

public class test {
    public static void main(String[] args) {
        System.out.println("----testing----");
        MyLinkedList linkedList = new MyLinkedList(10);
        linkedList.addFirst(11);
        linkedList.addFirst(13);
        linkedList.addLast(12);
        linkedList.addLast(14);
        linkedList.addLast(15);
        linkedList.addLast(144);
        linkedList.printList();
        System.out.println(linkedList.size());
        System.out.println(linkedList.indexOf(144));
    }
}
