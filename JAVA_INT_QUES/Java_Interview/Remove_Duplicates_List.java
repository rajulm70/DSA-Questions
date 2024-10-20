package Java_Interview;
import java.util.Arrays;
import Leetcode_Problems.ContainDuplicate;
public class Remove_Duplicates_List {
    static void removeDuplicates(int [] nums){
        ContainDuplicate print = new ContainDuplicate();
        Arrays.sort(nums);
        int i = 0;
        for(int num : nums){
            if(i < 1 || num > nums[i-1]){
                nums[i++] = num;
            }
        }
        print.printArray(nums,i);
        
    }
    public static void main(String[] args) {
        int nums [] = {1,2,3,5,4,4,2};
        removeDuplicates(nums);
    }
}
