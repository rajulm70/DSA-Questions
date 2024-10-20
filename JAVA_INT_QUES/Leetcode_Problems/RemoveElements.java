package Leetcode_Problems;

public class RemoveElements {

    static int Element(int [] nums,int val){
        
        int k =0;
        for(int num : nums){
            if(num!=val){
                k++;
            }
        }

        return k;
    }
    public static void main(String[] args) {
    int nums [] = {3,2,2,3};
    int k = Element(nums, 3);
    System.out.println(k);
        
    }
}
