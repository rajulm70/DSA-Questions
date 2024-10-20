package Leetcode_Problems;

public class FirstAndLastPosition {
    static int[] searchRange(int[] nums, int target) {
        int res [] = new int[2];
        if(nums.length == 0){
            return new int[] {-1,-1};
        }
        int low = 0;
        int high = nums.length - 1;
        while(low<high){
            int mid = low + (high-low)/2;
            if(nums[mid] < target){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        if(nums[low] != target){
            return new int[] {-1,-1};
        }
        res[0] = low;
        high = nums.length;
        while(low<high){
            int mid = low + (high-low)/2;
            if(nums[mid] <= target){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        res[1] = low-1;
        return res;
    }
    public static void main(String[] args) {
        int [] res = searchRange(new int [] {1,2,3,4,4,4,5}, 4);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
