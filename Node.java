class Node {
    private String item;
    private Node left;
    private Node right;
    
    public Node(String item, Node left, Node right) {
        this.item = item;
        this.left = left;
        this.right = right;
    }

    public String getItem() {
        return item;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
    public void setItem(String item) {

    }
    public Node setLeft(Node set) {
        this.left = set;
        return set;
    }

    public Node setRight(Node set) {
        this.right = set;
        return set;
    }
}