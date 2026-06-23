package toper_world;

import java.util.Scanner;

public class MultiplicationTable25 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number you want to print table");
        n = scanner.nextInt();

        System.out.println(n + " table:-");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + "=" + (n * i));
        }
    }
}
