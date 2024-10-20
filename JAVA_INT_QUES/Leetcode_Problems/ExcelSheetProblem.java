package Leetcode_Problems;
import java.util.Scanner;

public class ExcelSheetProblem {
    static int findNum(String str){
        char c [] = str.toCharArray();
        int result = 0;
        for(int i=0;i<c.length;i++){
            int num = c[i] - 65 +1;
            result = result * 26 + num;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Column name: ");
        String str = sc.nextLine();
        int res = findNum(str);
        System.out.println(res);
    }
}
