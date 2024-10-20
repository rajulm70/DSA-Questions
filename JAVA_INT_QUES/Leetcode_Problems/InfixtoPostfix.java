package Leetcode_Problems;

import java.util.Stack;

public class InfixtoPostfix {

    static int prec(char C){
        if(C == '^'){
            return 3;
        }
        else if(C=='/' || C=='*' ){
            return 2;
        }
        else if(C=='+' || C=='-'){
            return 1;
        }
        else{
            return -1;
        }
    }

    static char assoc(char C){
        if(C=='^'){
            return 'R';
        }
        return 'L';
    }

    static void infixTopostfix(String str){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if((c>='a' && c<='z')|| ( c>'A' && c<='Z')|| ( c>'0' && c<='9')){
                result.append(c);
            }
            else if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && (prec(str.charAt(i)) < prec(stack.peek()) ||
                                             prec(str.charAt(i)) == prec(stack.peek()) &&
                                                 assoc(str.charAt(i)) == 'L')) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        System.out.println(result);
    }
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        infixTopostfix(exp);
    }
}
