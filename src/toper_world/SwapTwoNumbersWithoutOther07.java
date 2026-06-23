package toper_world;

import java.util.Scanner;

public class SwapTwoNumbersWithoutOther07 {
    public static void main(String[] args) {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        x = scanner.nextInt();
        System.out.println("enter second number");
        y = scanner.nextInt();
        System.out.println("before swapping :x = " + x + " and y = " + y);
        x = x + y;//30
        y = x - y;//10
        x = x - y;//20
        System.out.println("after swapping :x = " + x + " and y = " + y);
    }
}
