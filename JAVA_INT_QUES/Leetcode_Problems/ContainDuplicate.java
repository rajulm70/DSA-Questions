package Leetcode_Problems;
public class ContainDuplicate {
    static boolean isDuplicate(int [] nums){
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==num){
                    return true;
                }
            }
        }
        return false;
    }
    public void printArray(int arr[] , int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums [] = {1,2,3,4};
        boolean dupli = isDuplicate(nums);
        System.out.println(dupli);
    }
}
