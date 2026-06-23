package toper_world;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number, i, fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number to calculate its factorial: ");
        number = scanner.nextInt();
        if (number < 0) {
            System.out.println("number should be non-negative");
            return;
        } else {
            for (i = 1; i <= number; i++) {
                fact = fact * i;
            }
        }
        System.out.println("factorial of "+number+" : "+fact);
    }
}
