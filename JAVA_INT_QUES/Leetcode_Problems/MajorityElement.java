package Leetcode_Problems;
public class MajorityElement {
    static int findMajority(int [] nums){
        int cand = 0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                cand = nums[i];
            }
            if(cand == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return cand;
    }
    public static void main(String[] args) {
        int nums [] = {1,2,2,3,3,3,3};
        int major = findMajority(nums);
        System.out.println(major);
    }
}
