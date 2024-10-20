package ApnaLibrary;

import java.util.Arrays;

public class Missing_Number {
    static int findMissingNum(int [] nums){
        Arrays.sort(nums);
        int num = nums.length;
        for(int i=0;i<nums.length;i++){
            num = i^num;
            num = num^nums[i];
        }
        return num;
    }
    public static void main(String[] args) {
        int nums[] = {3,0,1};
        int num = findMissingNum(nums);
        System.out.println(num);
    }
}
