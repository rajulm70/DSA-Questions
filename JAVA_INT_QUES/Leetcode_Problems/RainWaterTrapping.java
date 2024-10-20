package Leetcode_Problems;
public class RainWaterTrapping {
    static int calculateWater(int [] heights){
        int n = heights.length;

        // calculate left max array
        int [] leftMax = new int[n];
        leftMax[0] = heights[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(heights[i], leftMax[i-1]);
        }

        // calculate right max array
        int [] rightMax = new int[n];
        rightMax[n-1] = heights[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(heights[i], rightMax[i+1]);
        }

        // now calculate trapped water
        int  water = 0;
        for(int i =0;i<n;i++){
            water += Math.min(leftMax[i], rightMax[i])-heights[i];
        }
        return water;
    }
    public static void main(String[] args) {
        int [] heights = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int trappedWater = calculateWater(heights);
        System.out.println("The tarpped water is : "+trappedWater);
    }
}
