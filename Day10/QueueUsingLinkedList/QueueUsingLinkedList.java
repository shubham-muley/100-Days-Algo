import java.util.LinkedList;

public class QueueUsingLinkedList {
    LinkedList<Integer> l1 = new LinkedList();

    public void enqueue(int item){
        l1.addLast(item);
    }

    public int dequeue(){
        return l1.removeFirst();
    }

    public void print(){
        System.out.println(l1);
    }


}
