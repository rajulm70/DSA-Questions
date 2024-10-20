package Recursion;

public class Factorial {
    static int findFact(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            return num*findFact(num-1);
        }
    }
    public static void main(String[] args) {
        int res = findFact(1);
        System.out.println(res);
    }
}
