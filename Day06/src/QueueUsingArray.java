import java.util.Arrays;

public class QueueUsingArray {

    private int[] items;
    private int rear;
    private int front;
    private int count;

    public QueueUsingArray(int capacity){
        items = new int[capacity];
    }

    public void enqueue(int item){
        if(isFull()) throw new IllegalStateException();
        items[rear] = item;
        rear=(rear+1)%items.length;     //circular Arrays
        count++;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }

    public int dequeue(){
        if(isEmpty()) throw new IllegalStateException();
        int a = items[front];
        items[front]=0;
        front = (front+1)% items.length;         ////circular Arrays
        count--;
        return a;
    }

    public Boolean isEmpty()
    {
        return (count == 0);
    }

    public Boolean isFull()
    {
        return (count == items.length);
    }

}
