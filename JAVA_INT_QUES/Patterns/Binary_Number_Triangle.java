package Patterns;

public class Binary_Number_Triangle {
    static void binaryTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        binaryTriangle(5);
    }
}
