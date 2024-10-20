package ApnaLibrary;
import java.util.*;

public class Reverse_String_Using_Stack {
    static void reverseString(String str){
        Stack<Character> s = new Stack<>();
        int i = 0;
        while(i < str.length()){
            char c = str.charAt(i);
            s.push(c);
            i++;
        }
        String rev = "";
        while(!s.isEmpty()){
            char c = s.peek();
            rev = rev + c;
            s.pop();
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        String str = "Rajul"; 
        reverseString(str);
    }
}
