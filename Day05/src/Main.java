public class Main {
    public static void main(String[] args){
        /*String str = "(1+2)";
        BalancedExpression exp = new BalancedExpression();
        System.out.println(str+" is it balanced : "+exp.isBalanced(str));

        str = "<1+2+3]";
        System.out.println(str+" is it balanced : "+exp.isBalanced(str));

        str = "{";
        System.out.println(str+" is it balanced : "+exp.isBalanced(str));
        */

        StackUsingArray stack1 = new StackUsingArray();

        stack1.push(20);
        stack1.push(30);
        stack1.push(50);

        System.out.println(stack1);
        stack1.pop();
        stack1.pop();
        System.out.println("Is stack empty : "+stack1.isEmpty());
        stack1.pop();
        System.out.println("Is stack empty : "+stack1.isEmpty());
        stack1.push(20);
        stack1.push(30);
        stack1.push(50);
        System.out.println("Top element is "+stack1.peek());
        for(int a=0;a<30;a++)
            System.out.print("*");
        System.out.println();

        StackUsingLinkedlist stack2 = new StackUsingLinkedlist();


        stack2.push(10);
        stack2.push(20);
        stack2.push(30);

        stack2.pop();
        stack2.peek();
        System.out.println("Is stack empty : "+stack2.isEmpty());
        stack2.pop();
        stack2.pop();
        System.out.println("Is stack empty : "+stack2.isEmpty());

    }
}
