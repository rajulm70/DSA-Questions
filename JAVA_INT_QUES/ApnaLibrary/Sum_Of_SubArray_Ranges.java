package ApnaLibrary;
public class Sum_Of_SubArray_Ranges {

    static long findSum(int [] nums){
        int n = nums.length;
        long ans = 0;
        for(int i=0;i<n;i++){
            int minV = nums[i];
            int maxV = nums[i];
            for(int j=i;j<n;j++){
                minV = Math.min(minV, nums[j]);
                maxV = Math.max(maxV, nums[j]);
                ans += maxV - minV;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums [] = {1,2,3};
        long res = findSum(nums);
        System.out.println(res);
    }
}
