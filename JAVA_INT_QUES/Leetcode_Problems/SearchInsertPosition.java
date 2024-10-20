package Leetcode_Problems;

import java.util.Arrays;

public class SearchInsertPosition {

static int find(int [] arr,int val){
    Arrays.sort(arr);
    int start = 0;
    int end = arr.length;
    while(start < end){
        int mid = (start+end)/2;
        if(arr[mid]==val){
            return mid;
        }
        else if(arr[mid]<val){
            start = mid+1;
        }
        else{
            end = mid;
        }
    }
    return start;
}

    public static void main(String[] args) {
        int [] arr = {1,3,5,6};
        int idx = find(arr, 2);
        System.out.println(idx);
    }
}
