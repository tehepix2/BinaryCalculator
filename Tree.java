import java.util.*;

public class Tree {
    private Node head;

    public Tree (Node head) {
        this.head = head;
    }

    public Node makeTree(Stack<String> stack) {
        if (stack.size() > 0) {
            switch (stack.peek()) {
                case "+":
                    stack.pop();
                    this.head = setLeft("+", new Node(makeTree(stack), new Node(makeTree(stack))));
                    break;

                case "-":
                stack.pop();
                    Double num4 = Double.valueOf(stack.pop());
                    Double num3 = Double.valueOf(stack.pop());
                    stack.push(((Double)(num3 - num4)).toString());
                    break;

                case "*":
                    stack.pop();
                    Double num6 = Double.valueOf(stack.pop());
                    Double num5 = Double.valueOf(stack.pop());
                    stack.push(((Double)(num5 * num6)).toString());
                    break;

                case "/":
                stack.pop();
                    Double num8 = Double.valueOf(stack.pop());
                    Double num7 = Double.valueOf(stack.pop());
                    stack.push(((Double)(num7 / num8)).toString());
                    break;

                case "%":
                    stack.pop();
                    Double num10 = Double.valueOf(stack.pop());
                    Double num9 = Double.valueOf(stack.pop());
                    stack.push(((Double)(num9 % num10)).toString());
                    break;

                case "^":
                    stack.pop();
                    Double num12 = Double.valueOf(stack.pop());
                    Double num11 = Double.valueOf(stack.pop());
                    stack.push(((Math.pow(num11, num12) + ""))); //Turns out doubles can be turned into string by just adding "" to them
                    break;    
            }
        }
    }
    
        
    

    public Node getHead() {
        return head;
    }
}
