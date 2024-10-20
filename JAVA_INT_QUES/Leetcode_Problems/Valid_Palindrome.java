package Leetcode_Problems;
public class Valid_Palindrome {
    static boolean checkPalindrome(String str){
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if((str.charAt(i) >=97 && str.charAt(i) <= 122 ) || (str.charAt(i) >=48 && str.charAt(i) <= 57)){
                sb.append(str.charAt(i));
            }
        }
        for(int i=0;i<sb.length()/2;i++){
            if(sb.charAt(i) != sb.charAt(sb.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal: Panama";
        System.out.println(checkPalindrome(str1));
    }
}
