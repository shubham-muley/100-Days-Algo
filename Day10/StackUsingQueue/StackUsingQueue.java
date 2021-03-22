import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {
    Queue q1 = new ArrayDeque();
    Queue q2 = new ArrayDeque();

    public boolean isEmpty(){
        return (q1.isEmpty()&&q2.isEmpty());
    }

    public int pop(){
        if(q1.size()>q2.size()){
            return (int) q1.remove();
        }
        else{
            return (int)q2.remove();
        }
    }
    public void push(int item){
        if(q1.isEmpty()){
            q1.add(item);
            while(!q2.isEmpty())
                q1.add(q2.remove());
        }
        else{
            q2.add(item);
            while(!q1.isEmpty())
                q2.add(q1.remove());
        }
    }

    public int peek(){
        if(q1.size()>q2.size()){
            return (int) q1.peek();
        }
        else{
            return (int)q2.peek();
        }
    }

    public int size(){
        return (q1.size()+ q2.size());
    }

    public void print(){
        if(q1.size()>q2.size()){
            while(!q1.isEmpty()){
                System.out.print(q1.peek()+" ");
                q2.add(q1.remove());
            }
        }
        else{
            while(!q2.isEmpty()) {
                System.out.print(q2.peek()+" ");
                q1.add(q2.remove());
            }
        }
        System.out.println();

    }
}
