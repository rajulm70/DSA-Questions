package Leetcode_Problems;
public class SingleNumber {
    static int findSingleNum(int [] nums){
        int value = 0;
        for(int i=0;i<nums.length;i++){
            value = value^nums[i];
        }
        return value;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,5,2,2,4,4};
        int res = findSingleNum(nums);
        System.out.println(res);
    }
}
