class Node<T> {
    public T data;
    public Node next;

    public void displayNodeData() {
        System.out.println("{ " + data + " } ");
    }
}
public class SinglyLinkedList<T> {
    private Node head;

    public boolean isEmpty() {
        return (head == null);
    }

    // used to insert a node at the start of linked list
    public void insertFirst(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
    // used to delete node from start of linked list
    public Node deleteFirst() {
        Node temp = head;
        head = head.next;
        return temp;
    }

    // Use to delete node after particular node
    public void deleteAfter(Node after) {
        Node temp = head;
        while (temp.next != null && temp.data != after.data) {
            temp = temp.next;
        }
        if (temp.next != null)
            temp.next = temp.next.next;
    }
    // used to insert a node at the start of linked list
    public void insertLast(T data) {
        Node current = head;
        while (current.next != null) {
            current = current.next; // we'll loop until current.next is null
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }

    // For printing Linked List
    public void printLinkedList() {
        System.out.println("Printing LinkedList (head --> last) ");
        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }
    public void getKthElement(int K){
        Node P1;
        Node P2;

        P1 = head.next;
        P2 = head.next;
        int i=0;
        while(P2.next!=null){
            i++;

            P2 = P2.next;

            if(i>=K){
                P1 = P1.next;
            }
        }
        P1.displayNodeData();
        }
}
