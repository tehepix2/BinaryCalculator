public class Node {
    private Object obj;
    private Node left;
    private Node right;

    public Node(Object name, Node left, Node right) {
        this.obj = name;
        this.left = left;
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node thing) {
        this.left = thing;    
    }
    public void setRight(Node thing) {
        this.right = thing;
    }
    public Object getObj() {
        return obj;
    }
}
