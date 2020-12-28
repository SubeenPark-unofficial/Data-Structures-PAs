import structures.stack.LinkedStack;
import structures.stack.Stack;

class Parentheses {
    public boolean isValid(String s) {
        //Fill your code here
        char[] str2arr = s.toCharArray();
        char[] left = {'(', '{', '['};
        char[] right = {')', '}', ']'};
        LinkedStack<Character> stack = new LinkedStack<Character>();

        for (char ch : str2arr){
            if (ch == left[0]){
                stack.push(right[0]);
            }
            else if (ch == left[1]){
                stack.push(right[1]);
            }
            else if (ch == left[2]){
                stack.push(right[2]);
            }
            else {
                if (stack.isEmpty() || stack.pop() != ch) return false;
            }
        }
        return stack.isEmpty();
    }
}