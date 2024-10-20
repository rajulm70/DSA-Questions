package Patterns;

public class Reverse_letter_triangle {
    public static void main(String[] args) {
        int n = 3;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
    }
}
