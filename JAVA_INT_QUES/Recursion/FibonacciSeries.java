package Recursion;

public class FibonacciSeries {
    static int printFibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fn1 = printFibonacci(n-1);
        int fn2 = printFibonacci(n-2);
        int fn = fn1 + fn2;
        return fn;
    }
    public static void main(String[] args) {
        int res = printFibonacci(5);
        System.out.println(res);
    }
}
