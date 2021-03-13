import java.util.Arrays;

public class Arrays_exercise{
    public static void main(String[] args){
        Array a1 = new Array(3);
        a1.insert(2);
        System.out.println(a1.len());
        a1.print();
        a1.insert(5);
        a1.print();
        a1.insert(10);
        a1.insert(7);
        a1.print();
        System.out.println(a1.len());
        a1.removeAt(2);
        System.out.println();
        a1.print();
        System.out.println(a1.len());
        System.out.println();
        System.out.println(a1.Indexof(5));


    }
}
