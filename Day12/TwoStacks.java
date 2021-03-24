import java.util.Arrays;

public class TwoStacks {
    private int[] items = new int[10];
    private int p1=0;
    private int p2=items.length - 1 ;

    public void push(int StackNumber, int item) {
        if (this.isFull())
            throw new StackOverflowError();
        if(StackNumber==1){
            items[p1++] = item;
        }
        else if(StackNumber ==2){
            items[p2--] = item;
        }
        else System.out.println("StackNumber doesn't belong to 1 or 2");
    }

    public int pop(int StackNumber){
        if (StackNumber==1) {
            if (this.isEmpty(StackNumber)) {
                System.out.println("Stack1 is empty");
                throw new IllegalStateException();
            }
            else return items[--p1];
        }

        else if(StackNumber ==2) {
            if(this.isEmpty(StackNumber)){
                System.out.println("Stack2 is empty");
                throw new IllegalStateException();
            }
            else return items[++p2];
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public String toString(){
        return Arrays.toString(Arrays.copyOfRange(items,0,p1));
    }

    public int peek(int StackNumber){

        if (StackNumber==1) {
            if (this.isEmpty(StackNumber)) {
                System.out.println("Stack1 is empty cannot peek");
            }
            else return items[p1-1];
        }

        else if(StackNumber ==2) {
            if(this.isEmpty(StackNumber)){
                System.out.println("Stack2 is empty cannot peek");
            }
            else return items[p2+1];
        }
        return Integer.MIN_VALUE;
    }

    public boolean isEmpty(int StackNumber){
        if(StackNumber==1)
            return p1==0;

        else if (StackNumber==2)
            return p2==items.length -1;
        return true;
    }

    public boolean isFull(){
        if(p2-p1==-1){
            return true;
        }
        else return false;
    }

    public void print(int StackNumber){
        if(this.isEmpty(StackNumber)){
            System.out.println("Stack is empty");
        }

        if(StackNumber==1){
            System.out.println("\nStack 1:");
            for(int i=0;i<p1;i++){
                System.out.print( items[i] +" ");
            }
            System.out.println();
        }
        else if(StackNumber==2){
            System.out.println("\nStack 2:");
            for(int i=items.length-1;i>p2;i--){
                System.out.print( items[i] +" ");
            }
            System.out.println();
        }
    }
}
