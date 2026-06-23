package toper_world;

import java.util.Scanner;

public class BreakWhileLoop21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("input an integer");
            n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println("you entered "+n);
        }
    }
}
