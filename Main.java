import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        lib.clearConsole();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an expression in postfix: ");
        String exp = input.nextLine();
        lib.clearConsole();
        
        for(int i = exp.length() - 1; i>=0; i--) {
          
            switch (exp.charAt(i)) {
                case '+':
                    stack.pop();
                    Double num2 = Double.valueOf(stack.pop()); // the assignment here is kind of backwards because pop() returns the second number at first, so the second number needs to be assigned first
                    Double num1 = Double.valueOf(stack.pop());
                    stack.push(((Double)(num1 + num2)).toString());
                    break;

                case '-':
                stack.pop();
                    Double num4 = Double.valueOf(stack.pop());
                    Double num3 = Double.valueOf(stack.pop());
                    stack.push(((Double)(num3 - num4)).toString());
                    break;

                case '*':
                    stack.pop();
                    Double num6 = Double.valueOf(stack.pop());
                    Double num5 = Double.valueOf(stack.pop());
                    stack.push(((Double)(num5 * num6)).toString());
                    break;

                case '/':
                stack.pop();
                    Double num8 = Double.valueOf(stack.pop());
                    Double num7 = Double.valueOf(stack.pop());
                    stack.push(((Double)(num7 / num8)).toString());
                    break;

                case '%':
                    stack.pop();
                    Double num10 = Double.valueOf(stack.pop());
                    Double num9 = Double.valueOf(stack.pop());
                    stack.push(((Double)(num9 % num10)).toString());
                    break;

                case '^':
                    stack.pop();
                    Double num12 = Double.valueOf(stack.pop());
                    Double num11 = Double.valueOf(stack.pop());
                    stack.push(((Math.pow(num11, num12) + ""))); //Turns out doubles can be turned into string by just adding "" to them
                    break;    
            }
        }

    }

    

    
}
