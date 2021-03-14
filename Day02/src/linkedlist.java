public class linkedlist<T> {
    private Node head;
    private Node tail;
    private int size;

    public linkedlist() {
        size = 0;
    }

    private class Node {
        T element;
        Node next;
        Node prev;
        public Node(T element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(T element) {
        Node tmp = new Node(element, head, null);
        if(head != null ) {
            head.prev = tmp;
        }
        head = tmp;
        if(tail == null) {
            tail = tmp;
        }
        size++;
        System.out.println("Adding element: "+element);
    }
    public void addLast(T element) {
        Node tmp = new Node(element, null, tail);
        if(tail != null) {
            tail.next = tmp;
        }
        tail = tmp;
        if(head == null) {
            head = tmp;
        }
        size++;
        System.out.println("Adding element: "+element);
    }
    public void iterateForward(){
        System.out.println("Iterating forward.");
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.element);
            tmp = tmp.next;
        }
    }

    public void reverse(){
    if (isEmpty()) return;
    Node previous = head;
    Node current = head.next;

    while(current!=null){
        Node next = current.next;
        current.next = previous;
        previous = current;
        current = next;
    }
    tail = head;
    tail.next = null;
    head = previous;

    }
}