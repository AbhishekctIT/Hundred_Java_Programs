package toper_world;

public class ReverseString30 {
    public static void main(String[] args) {
        String str = "hello";
        String org = str;
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(org);
        System.out.println(reverse);
        StringBuffer sb=new StringBuffer("hello world");
        System.out.println(sb.reverse());
    }
}
