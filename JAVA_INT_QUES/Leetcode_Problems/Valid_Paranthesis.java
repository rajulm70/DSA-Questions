package Leetcode_Problems;

import java.util.Stack;

public class Valid_Paranthesis {
    static boolean isValid(String s) {
        char ch [] = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : ch){
            if(stack.isEmpty()){
                stack.push(c);
            }
            else{
                char top = stack.peek();
                if(c-top == 1 || c-top == 2){
                    stack.pop();
                }
                else{
                    stack.push(c);
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        
        return false;
    }
    public static void main(String[] args) {
        boolean res = isValid("{([])}");
        System.out.println(res);
    }
}
