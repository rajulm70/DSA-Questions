package ApnaLibrary;
public class RemoveDuplicates {
    static int removeDupli(int nums []){
        int i = 0;
        for(int j=1;j<nums.length;j++){
            if(nums[i] < nums[j]){
                int temp = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int nums [] = {0,1,1,2,2,2,3,3,4,4};
        System.out.println(removeDupli(nums));
    }
}
