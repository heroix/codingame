package clash;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by heroix on 2016-01-27.
 */
public class ParanthesisMatch {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String expression = in.next();
        System.out.println(isParenthesisMatch(expression));
    }

    public static boolean isParenthesisMatch(String str) {
        Stack<Character> stack = new Stack<Character>();

        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);

            if (c == '(')
                stack.push(c);
            else if (c == '{')
                stack.push(c);
            else if (c == '[')
                stack.push(c);
            else if (c == ')')
                if (stack.empty())
                    return false;
                else if (stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            else if (c == '}')
                if (stack.empty())
                    return false;
                else if (stack.peek() == '{')
                    stack.pop();
                else
                    return false;
            else if (c == ']')
                if (stack.empty())
                    return false;
                else if (stack.peek() == '[')
                    stack.pop();
                else
                    return false;
        }
        return stack.empty();
    }
}
