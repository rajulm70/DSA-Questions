package Leetcode_Problems;
import java.util.Arrays;

public class ChocolateDistribution {
    static int minDifference(int [] boxes,int n,int m){
        if (boxes.length == 0 || m == 0) {
            return 0;
        }
        Arrays.sort(boxes);
        int diff = boxes[boxes.length-1];
        for(int i =0;i<n-m+1;i++){
            int minElement = boxes[i];
            int maxElement = boxes[i+m-1];
            diff = Math.min(diff,maxElement-minElement);
        }
        return diff;
    }
    public static void main(String[] args) {
        int [] boxes = {7,3,2,4,9,12,56};
        int n = boxes.length;
        int diff = minDifference(boxes,n,3);
        System.out.println(diff);
    }
}
