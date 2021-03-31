public class BinaryTree {
    private Node root;

    private class Node{
        private int value;
        private Node LeftChild;
        private Node RightChild;

        public Node(int ele){
            this.value = ele;
        }

        @Override
        public String toString(){
            return "Node="+value;
        }
    }

    public void insert(int element){
        Node NEW = new Node(element);

        if(root==null){
            root=NEW;
            return;
        }

        Node current = root;
        while(true) {
            if (element < current.value)
            {
                if(current.LeftChild==null){
                    current.LeftChild = NEW;
                    break;
                }
                current = current.LeftChild;
            }
            else if (element > current.value)
            {
                if(current.RightChild==null){
                    current.RightChild = NEW;
                    break;
                }
                current = current.RightChild;

            }
            else
            {
                System.out.println(element+" already exists");
                return;
            }
        }



    }

    public boolean exist(int element){
        Node current = root;
        while(!(current==null)){
            if(element<current.value){
                current = current.LeftChild;
            }
            else if(element>current.value){
                current = current.RightChild;
            }
            else {
                return true;
            }
        }
        return false;

    }

    public void traversePreorder(){
        traversePreorder(root);
    }

    private void traversePreorder(Node root){
        if(root==null){
            return;
        }

        System.out.println(root.value);
        traversePreorder(root.LeftChild);
        traversePreorder(root.RightChild);
    }

    public void traverseInorder(){
        traverseInorder(root);
    }

    private void traverseInorder(Node root){
        if(root==null){
            return;
        }
        traverseInorder(root.LeftChild);
        System.out.println(root.value);
        traverseInorder(root.RightChild);
    }

    public void traversePostorder(){
        traversePostorder(root);
    }

    private void traversePostorder(Node root){
        if(root==null){
            return;
        }
        traversePostorder(root.LeftChild);
        traversePostorder(root.RightChild);
        System.out.println(root.value);
    }

    public int height(){
        return height(root);
    }

    private int height(Node root){
        if(root==null)
            return -1;

        if((root.LeftChild==null)&&(root.RightChild==null))
            return 0;

        return 1+ Math.max(height(root.LeftChild),height(root.RightChild));
    }
}
