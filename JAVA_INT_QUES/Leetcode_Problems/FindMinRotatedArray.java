package Leetcode_Problems;
public class FindMinRotatedArray {
    static int findMin(int [] arr){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<arr[low]){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return arr[high];
    }
    public static void main(String[] args) {
        int arr [] = {3,4,5,6,7,1,2};
        int res = findMin(arr);
        System.out.println(res);
    }
}
