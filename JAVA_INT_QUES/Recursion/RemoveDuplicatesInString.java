package Recursion;

public class RemoveDuplicatesInString {
    static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean [] map){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            // if the value will be true then in this case we do nothing because here already present that character
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            // firstly we map the char to true and then we append to it in the new string and then we call for next idx
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "apnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
