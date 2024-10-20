package Recursion;

public class SubSequence {
    public static void main(String[] args) {
        subSeq("", "abcd");
    }
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+"  ");
            return;
        }

        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }
}
