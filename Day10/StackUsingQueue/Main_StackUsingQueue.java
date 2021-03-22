public class Main_StackUsingQueue {
    public static void main(String[] args){

        StackUsingQueue stack = new StackUsingQueue();
        System.out.println("Is Stack empty = "+stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack.pop());
        System.out.println("size : "+stack.size());
        System.out.println("Top = "+stack.peek());
        stack.print();
        System.out.println(stack.pop());
        stack.print();

    }
}
