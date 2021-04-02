import java.util.ArrayList;

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

    public int min(){
        Node current = root;

        while(!(current.LeftChild==null))
            current = current.LeftChild;
        return current.value;

    }

    public boolean equals(BinaryTree B){
        return equals(this.root,B.root);
    }

    private boolean equals(Node first, Node second){
        if(first==null && second==null)
            return true;

        if(first!=null && second!=null)
            return first.value== second.value && equals(first.LeftChild,second.LeftChild) && equals(first.RightChild,second.RightChild);

        return false;
    }

    public boolean validate(){

        return validate(root,-Integer.MAX_VALUE,Integer.MAX_VALUE);
    }

    private boolean validate(Node Root, int min, int max){
        if(Root==null)
            return true;

        return Root.value>min
                && Root.value<max
                && validate(Root.LeftChild,-Integer.MAX_VALUE,Root.value)
                && validate(Root.RightChild,Root.value,Integer.MAX_VALUE);
    }

    public void NodesAtDistance(int distance){
        ArrayList<Integer> list = new ArrayList<>();
        NodesAtDistance(root,distance,list);
        System.out.println(list);
    }

    private void NodesAtDistance(Node Root, int distance, ArrayList<Integer> list){
        if(Root==null)
            return;

        if(distance==0) {
            list.add(Root.value);
            return;
        }
        NodesAtDistance(Root.LeftChild,distance-1,list);
        NodesAtDistance(Root.RightChild,distance-1,list);
    }

    public int size(){
        return size(root);
    }
    private int size(Node Root){
        if(Root==null)
            return 0;
        else{
            return (1+size(Root.LeftChild)+size(Root.RightChild));
        }
    }

    public int countLeaf(){
        return countLeaf(root);
    }

    private int countLeaf(Node Root){
        if(Root==null){
            return 0;
        }

        if(Root.LeftChild==null && Root.RightChild==null){
            return 1;
        }

        else{
            return countLeaf(Root.LeftChild) + countLeaf(Root.RightChild);
        }
    }

    public int max(){ return max(root);}

    private int max(Node Root){
        if(Root.LeftChild==null && Root.RightChild==null){
            return Root.value;
        }

        return max(Root.RightChild);
    }

    private boolean isLeaf(Node node){
        if(node.LeftChild==null && node.RightChild==null)
            return true;
        return false;
    }

    public boolean areSibling(int a,int b){
        return areSibling(root,a,b);
    }
    private boolean areSibling(Node Root,int a, int b){
        if(Root.LeftChild==null || Root.RightChild==null){
            return false;
        }

        Node l=Root.LeftChild;
        Node r=Root.RightChild;
        if((l.value==a && r.value==b)||(l.value==b && r.value==a)){
            return true;
        }
        else{
            return areSibling(Root.LeftChild,a,b) || areSibling(Root.RightChild,a,b);
        }
    }

    public boolean contains(int element){
        return contains(root,element);
    }

    private boolean contains(Node Root, int element){
        if(Root==null){
            return false;
        }
        if(Root.value==element)
            return true;
        else{
            return contains(Root.LeftChild,element)||contains(Root.RightChild,element);
        }
    }
}
