package Leetcode_Problems;
import java.util.Scanner;

public class Factorial {

    static int findFact(int num){
        int res = 1;
        if(num == 0){
            return res;
        }
        else{
            res = num*findFact(num-1);
        }
        return res;
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate the factorial: ");
        int num = sc.nextInt();
        int result = findFact(num);
        System.out.printf("The factorial is %d ",result);
    }
}
