package Leetcode_Problems;
public class validPalindrome_125 {
    public static void main(String[] args) {
        String str = "race a car";
        boolean ans = isPalindrome(str);
        System.out.println(ans);

    }
    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            if((str.charAt(i) >= 97 && str.charAt(i) <= 122) || (str.charAt(i) >= 48 && str.charAt(i) <= 57)){
                sb.append(str.charAt(i));
            }
        }

        for(int i=0;i<sb.length()/2;i++){
            if(sb.charAt(i) != sb.charAt(sb.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}