package Leetcode_Problems;
public class NumberOfIslands {
    static int findIslands(char [][] grids){
        int count = 0;
        for(int i=0;i<grids.length;i++){
            for(int j=0;j<grids[i].length;j++){
                if(grids[i][j] == '1'){
                    count ++;
                    callDFS(grids,i,j);
                }
            }
        }
        return count;
    }
    static void callDFS(char [][] grids, int i, int j){
        if(i < 0 || j < 0 || i >= grids.length || j >= grids[i].length || grids[i][j] == '0'){
            return;
        }
        grids[i][j] = '0';

        callDFS(grids, i, j+1); // horizontally right
        callDFS(grids, i, j-1); // horizontally left
        callDFS(grids, i+1, j); // vertically down
        callDFS(grids, i-1, j); // vertically up
    }
    public static void main(String[] args) {
        char [][] grids = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        int num = findIslands(grids);
        System.out.println(num);
    }
}
