public class Main {
    public static void main(String[] args){
        QueueUsingArray que= new QueueUsingArray(3);
        System.out.println("Is it Empty : "+que.isEmpty());
        que.enqueue(10);
        que.enqueue(20);
        System.out.println(que);
        System.out.println(que.dequeue());
        que.enqueue(30);
        System.out.println(que);
        que.enqueue(40);
        System.out.println("IS it Full : "+que.isFull());
        System.out.println(que);
    }
}
