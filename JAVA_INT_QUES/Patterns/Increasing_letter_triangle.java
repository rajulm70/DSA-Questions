package Patterns;

public class Increasing_letter_triangle {
    public static void main(String[] args) {
        int n = 3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+j) + " ");
            }
            System.out.println();
        }
    }
}
