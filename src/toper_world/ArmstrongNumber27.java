package toper_world;

public class ArmstrongNumber27 {
    public static void main(String[] args) {
        int num = 153;//1+125+27=...9474
        int org = num;
        int res = 0;
        int digit;
        int len = String.valueOf(num).length();
        while (num != 0) {
            digit = num % 10;
            res = (int) (res+ Math.pow(digit, len));
            num = num / 10;
        }
        if (org == res) {
            System.out.println(org + " is an armstrong number");
        } else {
            System.out.println(org + " is not an armstrong number");
        }
    }

}
