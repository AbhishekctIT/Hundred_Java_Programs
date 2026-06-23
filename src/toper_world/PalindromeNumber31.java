package toper_world;

public class PalindromeNumber31 {
    public static void main(String[] args) {
        int num = 12321;
        int org = num;
        int res = 0;
        while (num != 0) {
            int digit = num % 10;
            res = res * 10 + digit;
            num = num / 10;
        }
        if (org == res) {
            System.out.println(org + " is a palindrome");
        } else {
            System.out.println(org + " is not a palindrome");
        }
    }
}
