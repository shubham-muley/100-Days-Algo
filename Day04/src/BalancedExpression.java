import java.util.Stack;
public class BalancedExpression {
    public boolean isBalanced(String input){
        Stack<Character> stack = new Stack();

        for(char ch: input.toCharArray()) {
            if (ch == '(' || ch == '<' || ch == '['||ch=='{')
                stack.push(ch);
            if (ch == ')' || ch == '>' || ch == ']'||ch=='}') {
                if (stack.empty()) return false;
                char p = stack.pop();
                if ((p != '(' && ch == ')')|| (p != '<' && ch == '>')|| (p != '[' && ch == ']')|| (p != '{' && ch == '}')
                ) return false;
            }
        }
        return stack.empty();
    }
}
