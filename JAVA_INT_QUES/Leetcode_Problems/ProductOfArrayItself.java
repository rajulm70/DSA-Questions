package Leetcode_Problems;
public class ProductOfArrayItself {
    static int[] product(int [] arr){
        int n = arr.length;
        int left [] = new int[n];
        left[0] = 1;
        for(int i =1;i<n;i++){
            left[i] = left[i-1]*arr[i-1];
        }
        int right [] = new int[n];
        right[n-1] = 1;
        for(int i =n-2;i>=0;i--){
            right[i] = right[i+1]*arr[i+1];
        }
        int res [] = new int[n];
        for(int i=0;i<n;i++){
            res[i] = left[i]*right[i];
        }

        return res;
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4};
        int [] res = product(arr);
        for(int i =0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
