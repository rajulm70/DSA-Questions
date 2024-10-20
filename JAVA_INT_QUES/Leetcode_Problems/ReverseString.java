package Leetcode_Problems;
import java.util.Scanner;

public class ReverseString {
    static String reverseStr(String str){
        String newStr = "";
        for(int i=str.length()-1;i>=0;i--){
            newStr += str.charAt(i);
        }
        return newStr;
    }
    // With the help of string builder
    static StringBuilder reverseSB(){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the string to reverse : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-i-1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        return sb;
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the string which you want to reverse: ");
        String str = sc.nextLine();
        String result = reverseStr(str);
        System.out.printf("The Reversed string is : %s",result);
        System.out.println();
        StringBuilder sb = reverseSB();
        System.out.println(sb);
    }
}
