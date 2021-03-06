package tree.binary_search_tree;

public class Node {
    public int data;
    public Node left;
    public Node right;
    public Node parent;

    public Node(int data){
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node[data="+data+"]";
    }
}
