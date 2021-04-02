public class Main {
    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();

        b.insert(20);
        b.insert(10);
        b.insert(20);      //20 already exists but still we will test the edge case
        b.insert(30);
        b.insert(50);
        b.insert(15);
        b.insert(60);
        b.insert(25);
        b.insert(5);

        System.out.println("50 exists = "+b.exist(50));
        System.out.println("7 exists = "+b.exist(7));
        System.out.println("Preorder traversal is as follows:");
        b.traversePreorder();

        System.out.println("Inorder traversal is as follows:");
        b.traverseInorder();

        System.out.println("Postorder traversal is as follows:");
        b.traversePostorder();

        System.out.println("Height = "+b.height());

        System.out.println("Minimum Element is "+ b.min());
        b.insert(1);
        System.out.println("Minimum Element is "+ b.min());

        BinaryTree b2 = new BinaryTree();

        b2.insert(20);
        b2.insert(10);
        b2.insert(20);      //20 already exists but still we will test the edge case
        b2.insert(30);
        b2.insert(50);
        b2.insert(15);
        b2.insert(60);
        b2.insert(25);
        b2.insert(5);
        b2.insert(1);

        System.out.println("Are b1 and b2 BinarySearchTrees equal = "+b.equals(b2));

        BinaryTree b3 = new BinaryTree();

        b3.insert(20);
        b3.insert(10);
        b3.insert(20);      //20 already exists but still we will test the edge case
        b3.insert(30);
        b3.insert(50);
        b3.insert(15);
        b3.insert(60);
        b3.insert(25);
        b3.insert(5);

        System.out.println("Are b1 and b3 BinarySearchTrees equal = "+b.equals(b3));
        b.validate();
        System.out.println(b.validate());
        int a=3;
        System.out.print("Nodes at Distance of "+a+" are: ");
        b.NodesAtDistance(a);

        a=5;
        System.out.print("Nodes at Distance of "+a+" are: ");
        b.NodesAtDistance(a);

        a=2;
        System.out.print("Nodes at Distance of "+a+" are: ");
        b.NodesAtDistance(a);



        System.out.println(b3.size());
        b3.countLeaf();
        System.out.println(b3.countLeaf());
        System.out.println(b.max());
        int x=25;
        int y=50;
        System.out.println("Are "+x+" and "+y+" Siblings = "+b.areSibling(x,y));

        System.out.println(b.contains(60));
    }
}
