package Leetcode_Problems;

import java.util.ArrayList;

public class Container_With_Most_Water_Brute {

    // Two Pointer Approach
    static int findAreaTwo(ArrayList<Integer> heights){
        int max = 0;
        int lp =0;
        int rp = heights.size() - 1;
        while(lp < rp){
            int ht = Math.min(heights.get(lp),heights.get(rp));
            int width = rp - lp;
            int currMax = ht * width;
            max = Math.max(max, currMax);

            if(heights.get(lp) < heights.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return max;
    }

    // Brute Force
    static int findArea(ArrayList<Integer> heights){
        int max = 0;
        for(int i=0;i<heights.size();i++){
            for(int j=i+1;j<heights.size();j++){
                int high = Math.min(heights.get(i), heights.get(j));
                int width = j - i;
                int currArea = high * width;
                max = Math.max(max , currArea);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>();  // 1,8,6,2,5,4,8,3,7
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);
        int area = findAreaTwo(heights);
        System.out.println(area);
    }
}
