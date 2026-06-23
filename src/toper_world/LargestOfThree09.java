package toper_world;

import java.util.Scanner;

public class LargestOfThree09 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        if (x > y && x > z) {
            System.out.println("first number is greater");
        } else if (y > x && y > z) {
            System.out.println("second number is greater");
        } else if (z > x && z > y) {
            System.out.println("third number is greater");
        } else {
            System.out.println("entered numbers are not distinct");
        }
    }
}
