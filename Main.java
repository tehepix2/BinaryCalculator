import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args) {
        lib.clearConsole();
        Stack<String> stack = new Stack<String>();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a valid postfix expression: ");
        String expression = input.nextLine();
        
        Scanner scan = new Scanner(expression);
        scan.useDelimiter(" ");
        lib.clearConsole();

        while (scan.hasNext()) {
            stack.push(scan.next());
        }

        Node binaryHead = new Node(stack.pop(), null, null);
        Tree binaryTree = new Tree(binaryHead, stack);
        binaryTree.makeTree(binaryTree.getHead());
        

        input.close();
        scan.close();
    }
    


}