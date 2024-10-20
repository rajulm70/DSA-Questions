package Recursion;
public class TilingProblem {
    static int findWays(int n){ // it is the floor size 2*n  so we have to find the total number of ways we fill that floor by tile size 2*1
        if(n == 0 || n == 1){
            return 1;
        }
        // When tile fill vertically
        int fnm1 = findWays(n-1);     // when we fill vertically then he fills 1 size in width
        // When tile fill horizontally
        int fnm2 = findWays(n-2);     // when we fill horizontally then he fills 2 size in width
        // Now calculate total ways 
        int totalways = fnm1 + fnm2;
        return totalways;

    }
    public static void main(String[] args) {
        int ways = findWays(6);
        System.out.println(ways);
    }
}
