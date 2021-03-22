public class Main_UsingLinkedList {
    public static void main(String[] args){
        StackUsingLinkedlist stack = new StackUsingLinkedlist();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Minimum = "+stack.min);
        stack.pop();
        stack.peek();
        System.out.println("Is stack empty : "+stack.isEmpty());
        stack.pop();
        stack.pop();
        System.out.println("Is stack empty : "+stack.isEmpty());

    }
}
