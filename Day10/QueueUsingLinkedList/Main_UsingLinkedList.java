public class Main_UsingLinkedList {
    public static void main(String[] args){

        QueueUsingLinkedList q=new QueueUsingLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.print();
        System.out.println("dequeue:  Front element = "+q.dequeue());
        q.print();
        q.enqueue(40);
        q.enqueue(50);
        q.print();
        System.out.println("dequeue:  Front element = "+q.dequeue());
        q.print();



    }
}
