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

    }
}
