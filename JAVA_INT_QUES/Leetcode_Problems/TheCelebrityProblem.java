package Leetcode_Problems;
import java.util.Stack;

public class TheCelebrityProblem {

    static void findCelebrity(int [] [] arr){

        // let's declare the stack and pop top of the two index and eleminate any one and remaining push in to the stack
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(i);
        }

        // we elemimate until minimum two elements remain in the stack
        while(st.size()>=2){
            int i = st.pop();
            int j = st.pop();

            if(arr[i][j]==1){
                // if i knows j then i is not a celebrity
                st.push(j);
            }
            else{
                // if j knows i then j is not a celebrity
                st.push(i);
            }
        }

        int last = st.pop();
        for(int i=0;i<arr.length;i++){
            if(i!=last){
                if(arr[i][last] == 0 || arr[last][i] == 1){
                    System.out.println("Ther is no any celebrity!");
                    return;
                }
            }
        }
        System.out.println("The celebrity is : "+last);

    }

    public static void main(String[] args) {
        int [][] arr = {
            {0, 0, 1, 0}, 
            {0, 0, 1, 0}, 
            {0, 0, 0, 0}, 
            {0, 0, 1, 0} 
        };

        findCelebrity(arr);
    }
}
