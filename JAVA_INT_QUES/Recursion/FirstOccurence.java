package Recursion;

public class FirstOccurence {
    static int findOccurence(int num [] , int key, int i){
        if(i == num.length){
            return -1;
        }
        if(num[i]==key){
            return i;
        }
        return findOccurence(num, key, i+1);
    }
    public static void main(String[] args) {
        int [] num = {1,2,5,4,8,10,4};    
        int idx = findOccurence(num, 4, 0);
        System.out.println(idx);
    }
}
