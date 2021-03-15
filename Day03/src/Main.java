public class Main {
    public static void main(String args[]){
        try {
            SinglyLinkedList<Integer> Linkedlist = new SinglyLinkedList<>();
            Linkedlist.insertFirst(14);
            Linkedlist.insertFirst(546);
            Linkedlist.insertLast(36);
            Linkedlist.printLinkedList();
            Linkedlist.insertLast(20);
            Linkedlist.insertLast(30);
            Linkedlist.insertLast(50);
            Linkedlist.insertLast(100);
            Linkedlist.insertLast(120);
            Linkedlist.insertLast(150);
            Linkedlist.printLinkedList();
            System.out.println("3rd Element from last :");
            Linkedlist.getKthElement(3);
            System.out.println("5th Element from last :");
            Linkedlist.getKthElement(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
