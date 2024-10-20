public class PalindromeString {
    public static boolean Palindrome(String str){
        String str1=" ";
        for(int i=str.length();i>=0;--i){
            str1+=str.charAt[i];
        }
        if(str.equals(str1)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        System.out.println(Palindrome("abcba"));
    }
}
