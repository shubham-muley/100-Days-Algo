public class PriorityQueueUsingArray {
    private int[] Arr = new int[5];
    private int count;
    public void enqueue(int item){
        if(isFull()) throw new IndexOutOfBoundsException();
        int i;
        if(this.isEmpty())
            Arr[0]=item;
        else{
            for(i=count-1;i>=0;i--){
                if(item<Arr[i]){
                    Arr[i+1]=Arr[i];
                }
                else{
                    Arr[i+1]=item;
                    break;
                }
            }
        }
        count++;
    }

    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException();
        else {
            int a = Arr[0];
            for (int i = 0; i < count-1; i++) {
                Arr[i] = Arr[i + 1];
            }
            count--;
            return a;
        }
    }

    public void print(){
        for(int i=0;i<count;i++)
            System.out.print(Arr[i]+" ");
        System.out.println();
    }

    public int front() {
        return Arr[0];
    }

    public boolean isEmpty(){
        return count==0;
    }
    public boolean isFull(){
        return count==Arr.length;
    }
    public int length(){
        return count;
    }
}
