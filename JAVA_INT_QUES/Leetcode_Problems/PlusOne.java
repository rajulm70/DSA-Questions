package Leetcode_Problems;
public class PlusOne {
    static int [] resultArr(int [] arr){
        if(arr.length==1 && arr[0] ==0){
            arr[0]=1;
            return arr;
        }
        for(int i=arr.length-1;i>-0;i--){
            if(arr[i]<9){
                ++arr[i];
                return arr;
            }
            arr[i] = 0;
        }
        int[] ans = new int[arr.length + 1];
        ans[0] = 1;
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {0};
        int result [] = resultArr(arr);
        for(int num:result){
            System.out.print(num);
        }
    }
}
