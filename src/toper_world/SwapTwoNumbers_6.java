package toper_world;

import java.util.Scanner;

public class SwapTwoNumbers_6 {
    public static void main(String[] args) {
        int x, y, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        x = scanner.nextInt();
        System.out.println("enter second number");
        y = scanner.nextInt();
        System.out.println("before swapping :x = " + x + " and y = " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("after swapping :x = " + x + " and y = " + y);
    }
}
