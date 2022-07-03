package ss9_DSAList.bai_tap.ArrayList;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(2);
        myList.add(4);
        myList.add(6);
        myList.add(3);
        myList.add(5);
        System.out.println(myList);
        myList.add(2,2323);
        System.out.println(myList);
        MyList<Integer> newList = myList.clone();
        System.out.println(newList);
    }
}
