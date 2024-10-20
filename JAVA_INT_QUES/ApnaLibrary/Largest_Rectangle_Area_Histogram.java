package ApnaLibrary;
import java.util.*;
public class Largest_Rectangle_Area_Histogram {
    static int calculateArea(int [] arr){
        int maxArea = 0;
        int nsl [] = new int[arr.length];
        int nsr [] = new int[arr.length];

        Stack<Integer> s = new Stack<>();
        // find next smaller right
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //Next Smaller left
        s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //Find max area : width = j - i -1 = nsr[i] - nsl[i] -1
        for(int i=0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int currArea = width * height;
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;


    }
    public static void main(String[] args) {
        int [] arr = {2,1,5,6,2,3};
        System.out.println(calculateArea(arr));
    }
}
