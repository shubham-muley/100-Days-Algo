import java.util.Arrays;

public class StackUsingArray {

    private int[] items = new int[5];
    private int i;

    public void push(int item) {
        if (i == items.length)
            throw new StackOverflowError();
        items[i++] = item;
    }

    public int pop(){
        if (i==0) {
            System.out.println("Stack is empty");
            throw new IllegalStateException();
        }
        return items[--i];
        }
    @Override
    public String toString(){
        return Arrays.toString(Arrays.copyOfRange(items,0,i));
    }

    public int peek(){
        if(i==0)
            System.out.println("Stack is empty cannot peek");

        return items[i-1];
    }

    public boolean isEmpty(){
        return i==0;
    }

}


