package _02_leetcodes._stack;

import java.util.Stack;
// first make a stack
// traversal the s and make a character of s.charAt()
// stack push the characters
// check if the char pushed in stack is left of parentheses and right
// if not return false
// otherwise if stack is empty means all parentheses are paired
//https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }
            else {
                if (stack.isEmpty()) return false;
                char left = stack.pop();
                if (left == '(' && ch != ')' ) return false;
                if (left == '[' && ch != ']' ) return false;
                if (left == '{' && ch != '}' ) return false;
            }
        }
        return stack.isEmpty();
    }

}
