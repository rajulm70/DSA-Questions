package Leetcode_Problems;
public class MinMax {
    static void findMinMax(int nums[]){
        int min = nums[0];
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("The minimum number in the array is : "+min);
        System.out.println("The maximum number in the array is : "+max);
    }
    public static void main(String[] args) {
        int nums[] = {10,20,30,5,2};
        findMinMax(nums);
    }
}
