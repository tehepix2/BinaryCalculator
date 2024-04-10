public class Node {
    private Object item;
    private Node pointL;
    private Node pointR;

    public Node(Object obj, Node pointL, Node pointR) {
        item = obj;
        this.pointL = pointL;
        this.pointR = pointR;
    }

}
