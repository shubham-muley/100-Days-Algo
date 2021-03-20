import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();
    int count=0;

    public void add(int a){
        if(s2.isEmpty()){
            s2.push(a);
            count++;
        }

        else{
            for(int i=0;i<count;i++){
                s1.push(s2.pop());
            }

            s1.push(a);
            count++;

            for(int i=0;i<count;i++){
                s2.push(s1.pop());
            }
        }
    }

    public void print(){
        for(int i=0;i<count;i++) {
            System.out.print(this.front()+" ");
            s1.push(s2.pop());
        }
        for(int i=0;i<count;i++){
            s2.push(s1.pop());
        }
        System.out.println();
    }

    public int remove(){
        if(s2.isEmpty()) throw new IllegalStateException();
        count--;
        return s2.pop();
    }

    public int front(){
        return s2.peek();
    }

    public int length(){
        return count;
    }

}
