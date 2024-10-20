package Leetcode_Problems;
public class PeakIndexMountainArray {
    static int findPeak(int [] arr){
        int idx = 0;
        while (arr[idx] <= arr[idx+1]) {
            idx++;
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,1};
        int idx = findPeak(arr);
        System.out.println(idx);
    }
}
