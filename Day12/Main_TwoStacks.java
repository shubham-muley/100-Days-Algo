public class Main_TwoStacks {
    public static void main(String[] args){
        TwoStacks stacks = new TwoStacks();
        System.out.println("Is Stack 1 empty = "+stacks.isEmpty(1));
        stacks.push(1,10);
        stacks.push(1,20);
        stacks.push(1,30);
        stacks.push(1,40);
        System.out.println("Is Stack 2 empty = "+stacks.isEmpty(2));
        stacks.push(2,100);
        stacks.push(2,90);
        stacks.push(2,80);
        stacks.push(2,70);
        stacks.push(2,60);
        stacks.push(1,50);
        System.out.println("Are the stacks full = "+stacks.isFull());
        stacks.print(1);
        stacks.print(2);
        System.out.println("Top of stack1 = "+stacks.peek(1));
        System.out.println("Top of stack2 = "+stacks.peek(2));
        stacks.push(2,stacks.pop(1));
        stacks.print(2);
        System.out.println("Are the stacks full = "+stacks.isFull());
    }
}
