package Patterns;

public class Number_Crown {
    static void numberCrown(int n){
        int spaces = 2*(n-1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=0;k<spaces;k++){
                System.out.print("  ");
            }
            for(int l=i;l>=1;l--){
                System.out.print(l+" ");
            }
            System.out.println();
            spaces = spaces - 2;
        }
    }
    public static void main(String[] args) {
        numberCrown(5);
    }
}
