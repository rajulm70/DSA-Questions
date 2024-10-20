package Recursion;

public class SumOfnNaturalNumbers {
    static int findSum(int num){
        if(num < 0){
            System.out.println("Sorry please enter the valid number !");
            return -1;
        }
        if(num == 0){
            return 0;
        }
        else{
            return num + findSum(num-1);
        }
    }
    public static void main(String[] args) {
        int res = findSum(-2);
        System.out.println(res);
    }
}
