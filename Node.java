class Node {
    private String head;
    private Node left;
    private Node right;
    
    public Node(String head, Node left, Node right) {
        this.head = head;
        this.left = left;
        this.right = right;
    }

    public String getHead() {
        return head;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
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