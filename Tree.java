import java.util.*;

public class Tree {
    private Stack<String> stack;
    private Node mainHead;
    
    public Tree(Node head, Stack<String> stack) {
        this.mainHead = head;
        this.stack = stack;
        
    }

    public Node getHead() {
        return mainHead;
    }
    
    public Node makeTree(Node current) {
        if (stack.peek().equals("+") || stack.peek().equals("-") || stack.peek().equals("*") || stack.peek().equals("/") || stack.peek().equals("^") || stack.peek().equals("%")) {
            current.setLeft(makeTree(new Node(stack.pop(), null, null)));
            current.setRight(makeTree(new Node(stack.pop(), null, null)));

        }
        else {
            if (!(stack.peek().equals("+") || stack.peek().equals("-") || stack.peek().equals("*") || stack.peek().equals("/") || stack.peek().equals("^") || stack.peek().equals("%"))) {
                current.setLeft(new Node(stack.pop(), null, null));
            }
            if (!(stack.peek().equals("+") || stack.peek().equals("-") || stack.peek().equals("*") || stack.peek().equals("/") || stack.peek().equals("^") || stack.peek().equals("%"))) {
                current.setRight(new Node(stack.pop(), null, null));
            }
            
        }
                
        return current;

    }
    public double solveTree(Node current) {
        if (current.getItem().equals("+")) {
            return (solveTree(current.getLeft()) + solveTree(current.getRight()));
        }
        else if (current.getItem().equals("-")) {
            return (solveTree(current.getLeft()) - solveTree(current.getRight()));
        }
        else if (current.getItem().equals("/")) {
            return (solveTree(current.getRight()) / solveTree(current.getLeft()));
        }
        else if (current.getItem().equals("*")) {
            return (solveTree(current.getLeft()) * solveTree(current.getRight()));
        }
        else if (current.getItem().equals("^")) {
            return (Math.pow(solveTree(current.getRight()), solveTree(current.getLeft())));
        }
        else if (current.getItem().equals("%")) {
            return (solveTree(current.getRight()) % solveTree(current.getLeft()));
        }
        else {
            return ((double)(Double.parseDouble(current.getItem())));
        }
        
                
        }
    }
