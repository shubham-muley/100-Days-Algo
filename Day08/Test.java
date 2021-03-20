public class Test {
    public static void main(String[] args){
        QueueUsingStack q =new QueueUsingStack();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(45);
        q.print();
        System.out.println("The front element of queue is "+q.front());
        q.remove();
        q.print();
        q.remove();
        q.print();
        q.add(50);
        q.print();
        System.out.println("The length of queue is "+q.length());
        System.out.println("The front element of queue is "+q.front());
    }
}
