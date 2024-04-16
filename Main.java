import java.util.*;

public class Main {
    public static void main(String[] args) {
        lib.clearConsole();
        Stack<String> stack = new Stack<String>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a postfix expression: ");
        String exp = input.nextLine();
        Scanner scan = new Scanner(exp);
        scan.useDelimiter(" ");
        lib.clearConsole();

        while (scan.hasNext()) {
            stack.push(scan.next()); 
        }
        stack.peek();
        Tree binaryTree = new Tree();
     
        
        System.out.println((String)binaryTree.getHead().getObj());
        
       
        input.close();
        scan.close();
    }
}
