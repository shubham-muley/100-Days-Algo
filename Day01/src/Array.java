import java.util.Arrays;

public class Array {
    int[] items;
    int count;

    public Array(int length)
    {
        items = new int[length];
    }

    public void print(){
        for(int i =0;i<count;i++)
            System.out.println(items[i]);
        System.out.println();
    }

    void insert(int item) {
        int i;
        if (items.length==count) {
            int[] arr1= new int[count+1];
            for(i=0;i<count;i++)
            {
                arr1[i] = items[i];
            }
            arr1[i] = item;
            count+=1;
            items = arr1;
        }
        else {
            items[count]=item;
            count+=1;
        }

    }

    public int len() {
        return items.length;
    }

    public void removeAt(int index){
        int[] arr1= new int[count-1];
        int i;
        for(i =0; i< index; i++)
            arr1[i]=items[i];
        for(i=index; i<count-1; i++)
            arr1[i] = items[i+1];
        count-=1;
        items = arr1;
        }

    public int Indexof(int item){
        for(int i=0;i<count;i++)
            if(items[i]==item)
                return i;

        return -1;
    }
}