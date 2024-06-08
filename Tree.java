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

    public void makeTree(Node head) {
        switch (stack.peek()) {
            case "+":
               

            case "-":
                

            case "*":
                

            case "/":
                

            case "^":
                

            case "%":
                

            default:
                


        }

    }
}