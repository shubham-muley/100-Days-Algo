public class Main_PQ {
    public static void main(String[] args){
        PriorityQueueUsingArray pq = new PriorityQueueUsingArray();
        pq.enqueue(10);
        pq.enqueue(40);
        pq.enqueue(50);
        pq.print();
        System.out.println(pq.length());
        pq.enqueue(25);
        pq.print();
        pq.enqueue(45);
        pq.print();
        System.out.println("Is the queue full? = "+pq.isFull());
        pq.dequeue();
        System.out.println("The front element is "+pq.front());
        pq.print();
        pq.dequeue();
        pq.dequeue();
        pq.print();
        System.out.println("Length = "+pq.length());
        System.out.println("The front element is "+pq.front());
    }
}
