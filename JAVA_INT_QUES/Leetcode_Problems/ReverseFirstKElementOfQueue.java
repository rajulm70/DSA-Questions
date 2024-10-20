package Leetcode_Problems;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseFirstKElementOfQueue {

    static int [] reverseQueue(int [] arr,int ele){

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            queue.add(arr[i]);
        }

        int [] newArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            
            for(int j=ele-1;j>=0;j--){
                int revEle = queue.peek();
                newArr [j] = revEle;
            }
            if(i>=ele){
                newArr[i]=arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index to reverse that queue : ");
        int ele = sc.nextInt();
        
        int [] arr = {1,2,3,4,5};
        int [] newArr = reverseQueue(arr,ele);
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]);
        }
    }
}
