package Leetcode_Problems;
public class NextGreaterElement {

    static int [] findGreater(int [] arr){
        int next [] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int pre = arr[i];
            int large = -1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>pre){
                    large = arr[j];
                    break;
                }
            }
            next[i] = large;
        }
        return next;
    }
    public static void main(String[] args) {
        int arr [] = {13 , 7, 6 , 12  };
        int next [] = findGreater(arr);
        for(int i = 0;i<next.length;i++){
            System.out.print(next[i]+" ");
        } 
    }
}
