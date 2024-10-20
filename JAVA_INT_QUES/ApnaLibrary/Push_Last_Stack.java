package ApnaLibrary;
import java.util.*;

public class Push_Last_Stack {
    public static void pushLast(Stack<Integer> s,int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushLast(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushLast(s,4);
        System.out.println(s);
    }
}
