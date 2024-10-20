package Leetcode_Problems;
public class RemoveDuplicatesFromArray {

    static int[] removeDuplicate(int [] arr){
        int n = arr.length;
        int newArr [] = new int[n];
        newArr[0] = arr[0];
        newArr[1] = arr[1];
        int total = 2;
        for(int i=2;i<n;i++){
            if(arr[i]==arr[i-2]){
            }
            else{
                newArr[total] = arr[i];
                total++;
            }
        } 
        return newArr;
    }
    public static void main(String[] args) {
        int [] arr = {0,0,0,1,1,1,1,2,2,2,3,3,3,4,5};
        int total[] = removeDuplicate(arr);
        for(int i=0;i<total.length;i++){
            System.out.print(total[i]+" ");
        }
        
    }
}
