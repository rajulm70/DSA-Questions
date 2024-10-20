package Recursion;

public class Skip_A {
    public static void main(String[] args) {
        skip("", "baccad");

        String s = skipApple("bdappleaccb");
        System.out.println(s);
    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);
        if(c == 'a'){
            skip(p, up.substring(1));
        }else{
            skip(p+c, up.substring(1));
        }
    }
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
}
