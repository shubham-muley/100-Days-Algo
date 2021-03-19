public class Arrays_exercise{
    public static void main(String[] args){
        Array_custom a1 = new Array_custom(3);
        a1.insert(2);
        System.out.println(a1.len());
        a1.insert(5);
        a1.insert(10);
        a1.insert(7);
        System.out.println("The a1 Array_custom is : ");
        a1.print();
        System.out.println();


        Array_custom a2 = new Array_custom(1);
        a2.insert(5);
        a2.insert(3);
        a2.insert(2);
        a2.insert(7);
        System.out.println("The a2 Array_custom is : ");
        a2.print();

        System.out.println("The a1 itersection a2 Array_custom is : ");
        a1.intersect(a2).print();
        System.out.println("Reverse of a2 is :");
        a2.reverse().print();

        System.out.println("The a2 Array_custom is : ");
        a2.print();

        a2.insertAt(20,2);
        System.out.println("The a2 Array_custom is : ");
        a2.print();

        a2.insertAt(40,5);
        System.out.println("The a2 Array_custom is : ");
        a2.print();
    }
}
