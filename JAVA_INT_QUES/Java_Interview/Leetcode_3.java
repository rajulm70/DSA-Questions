package Java_Interview;
public class Leetcode_3 {
    static int findLengthSub(String s){
        int count  = 0;
        for(int i=0;i<s.length();i++){
            int tempMax = 1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    break;
                }
                else{
                    tempMax++;
                }
            }
            count = Math.max(tempMax, count);
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(findLengthSub(s));
    }
}
