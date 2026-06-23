package toper_world;

import java.util.Scanner;

public class BreakContinueWhileLoop22 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter integer");
            n = scanner.nextInt();
            if (n != 0) {
                System.out.println("you entered " + n);
                continue;
            } else {
                break;
            }
        }
    }
}
