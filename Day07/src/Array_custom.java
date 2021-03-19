public class Array_custom {
    int[] items;
    int count;
    int Max;

    public Array_custom(int length)
    {
        items = new int[length];
    }

    public void print(){
        for(int i =0;i<count;i++)
            System.out.println(items[i]);
        System.out.println();
    }

    public int max(){
        return Max;
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
        if(Max<item) Max=item;

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

    public Array_custom intersect(Array_custom arr){
        int i,j;
        Array_custom a= new Array_custom(1);
        for(i=0;i<this.len();i++){
            for(j=0;j<arr.len();j++){
                if(this.items[i]==arr.items[j]){
                    a.insert(this.items[i]);
                }
            }
        }
        return a;
    }

    public Array_custom reverse(){
        int i;
        Array_custom a = new Array_custom(1);

        for(i=0;i<this.len();i++){
            a.insert(this.items[this.len() - i -1]);
        }
        return a;
    }

    public void insertAt(int item,int index){
        if(index<count){
            this.items[index]=item;
        }
        else{
            while(index>count){
                this.insert(0);
            }
            this.insert(item);
        }
    }
}