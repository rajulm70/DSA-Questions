package Java_Interview;
import Leetcode_Problems.ContainDuplicate;
public class Count_Smaller_After_Itself {
    static void countSmaller(int [] nums){
        ContainDuplicate print = new ContainDuplicate();
        int res[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int count = 0;
            for(int j = i+1;j<nums.length;j++){
                if(nums[j] < num){
                    count ++;
                }
            }
            res[i] = count;
        }
        print.printArray(res,nums.length);
    }
    public static void main(String[] args) {
        int nums[] = {5,2,6,1};
        countSmaller(nums);
    }
}
