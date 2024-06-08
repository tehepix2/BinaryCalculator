import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args) {
        lib.clearConsole();
        Stack<String> stack = new Stack<String>();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a valid postfix expression (e.g. 3 3 +): ");
        String expression = input.nextLine();
        
        Scanner scan = new Scanner(expression);
        scan.useDelimiter(" ");

        while (scan.hasNext()) {
            stack.push(scan.next());
        }

        Node treeHead = new Node(stack.pop(), null, null);
        Tree calcTree = new Tree(treeHead, stack);
        
        calcTree.makeTree(calcTree.getHead());
        System.out.print("Result: ");
        System.out.println(calcTree.solveTree(calcTree.getHead()));
        
        input.close();
        scan.close();
    }
    


}