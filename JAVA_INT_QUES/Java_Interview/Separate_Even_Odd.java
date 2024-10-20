package Java_Interview;


public class Separate_Even_Odd {
    static void print(int nums [], int n){
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
    static void separateNumbers(int [] nums){
        int odd [] = new int[nums.length];
        int count_odd = 0;
        int even [] = new int[nums.length];
        int count_even = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 0){
                even[count_even++] = nums[i];
            }
            else{
                odd[count_odd++] = nums[i];
            }
        }
        System.out.println("The odd numbers list is : ");
        print(odd, count_odd);
        System.out.println();
        System.out.println("The even numbers list is : ");
        print(even, count_even);

    }

    public static void main(String[] args) {
        int nums [] = {1,5,2,6,4,7,15,20,21,22,50};
        separateNumbers(nums);
    }
}
