package Leetcode_Problems;
public class MergeSortedArray {
    static void merge(int [] nums1,int [] nums2,int m,int n){
        int i=m-1,j=n-1,k=m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
    }
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0,0};
        int [] nums2 = {2,5,6,7};
        merge(nums1, nums2, 3, 4);
        for(int num : nums1){
            System.out.print(num + " ");
        }
    }
}
