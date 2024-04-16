import java.util.*;

public class Tree {
    private Node head;

    public Tree (Node head) {
        this.head = head;
    }
    public Tree () {
    
    }

    public Node makeTree(Stack<String> stack) {
        Node node;
        switch (stack.peek()) {
            case "+":
                stack.pop();
                node = new Node("+", makeTree(stack), makeTree(stack));
                break;

            case "-":
                stack.pop();
                node = new Node("-", makeTree(stack), makeTree(stack));
                break;

            case "*":
                stack.pop();
                node = new Node("*", makeTree(stack), makeTree(stack));
                break;

            case "/":
                stack.pop();
                node = new Node("/", makeTree(stack), makeTree(stack));
                break;

            case "%":
                stack.pop();
                node = new Node("%", makeTree(stack), makeTree(stack));
                break;

            case "^":
                stack.pop();
                node = new Node("^", makeTree(stack), makeTree(stack)); 
                break;    
            default:
                node = new Node(stack.pop(), null, null); 
        }
        return node;
            
        
        
    }

    public Double solveTree() {
        Double num = 0.0;

        return num;
    }
    
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
  

    public void printTree(Node head) {
        System.out.println((String)head.getObj());
        if (head.getLeft() != null) {
            printTree(head.getLeft());
            printTree(head.getRight());
        }
    }
}
