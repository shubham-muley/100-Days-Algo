import java.util.NoSuchElementException;

public class Main {
    public static void main(String args[]){
        try {
            linkedlist<Integer> Linkedlist = new linkedlist<>();
            Linkedlist.addFirst(14);
            Linkedlist.addFirst(546);
            Linkedlist.addLast(36);
            Linkedlist.iterateForward();
            Linkedlist.reverse();
            Linkedlist.iterateForward();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
