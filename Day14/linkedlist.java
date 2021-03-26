import java.util.LinkedList;
import java.util.NoSuchElementException;
public class linkedlist<T> {
    private Node head;
    private Node tail;
    private int size;
    //private Node a=head;
    //private Node b=tail;

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
    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (head == tail)
            head = tail = null;
        else {
            Node second = head.next;
            head.next = null;
            head = second;
        }

        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (head == tail)
            head = tail = null;
        else {
            Node previous = getPrevious(tail);
            tail = previous;
            tail.next = null;
        }

        size--;
    }

    private Node getPrevious(Node node) {
        Node current = head;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public void iterateForward(){
        System.out.println("Iterating forward.");
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.element+" ");
            tmp = tmp.next;
        }
        System.out.println();
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

    public void printMiddle_n() {
        //O(n)
        if (isEmpty())
            throw new IllegalStateException();

        Node a = head;
        Node b = head;
        while (b != tail && b.next != tail) {
            b = b.next.next;
            a = a.next;
        }

        if (b == tail) {
            System.out.print("The middle element is ");
            System.out.println(a.element);
        }
        else{
            System.out.print("The middle element are ");
            System.out.println(a.element + ", " + a.next.element);
        }
        }

    public static linkedlist<Integer> createWithLoop() {
        linkedlist<Integer> list = new linkedlist<>();

        list.addLast(11);
        list.addLast(12);
        list.addLast(13);

        linkedlist<Integer>.Node node = list.tail;

        list.addLast(21);
        list.addLast(22);
        list.addLast(23);
        list.addLast(24);

        list.tail.next = node;

        return list;
    }

    public boolean hasLoop() {
        linkedlist.Node p1 = head;
        linkedlist.Node p2 = head;

        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;

            if (p1 == p2)
                return true;
        }

        return false;
    }
}
