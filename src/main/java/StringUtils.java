public class StringUtils {
    public String reverseString(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return new String(sb);
    }

    public boolean isPalindrome(String s){
        String rev=reverseString(s);
//        System.out.println("rev "+rev);
//        System.out.println("s "+s);
        return rev.equals(s);
    }

    public String stringToUpperCase(String s){
        return s.toUpperCase();
    }
}
