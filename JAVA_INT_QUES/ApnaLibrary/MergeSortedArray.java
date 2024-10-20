package ApnaLibrary;

public class MergeSortedArray {
    static int [] mergeArr(int [] num1, int [] num2,int m, int n){
        int i = m-1;
        int j = n-1;
        int x = m + n -1;
        while(i>=0 && j>=0){
            if(num1[i]>num2[j]){
                num1[x] = num1[i];
                i--;x--;
            }
            else{
                num1[x] = num2[j];
                j--;x--;
            }
        }
        while(j>=0){
            num1[x] = num2[j];
                j--;x--;
        }
        return num1;
    }
    public static void main(String[] args) {
        int [] num1 = {1,2,3,0,0,0};
        int [] num2 = {2,5,6};
        int [] res = mergeArr(num1, num2, 3, 3);
        for(int n:res){
            System.out.print(n+" ");
        }
    }
}
