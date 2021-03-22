public class StackUsingLinkedlist {
    Node root;
    public int min=Integer.MAX_VALUE;
    private int min2=Integer.MAX_VALUE;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public boolean isEmpty()
    {
        if (root == null) {
            return true;
        }
        else
            return false;
    }

    public void push(int data)
    {
        Node newNode = new Node(data);
        if(min>data){
            min2=min;
            min=data;
        }


        if (root == null) {
            root = newNode;
        }

        else {
            Node temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }
    public int pop()
    {
        int popped;
        if (root == null){
            System.out.println("Stack is empty");
            throw new IllegalStateException();
        }

        else {
            popped = root.data;
            root = root.next;
        }
        if(popped==min){
            min=min2;
        }
        return popped;
    }
    public int peek()
    {
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return root.data;
        }
    }

}
