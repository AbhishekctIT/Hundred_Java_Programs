package toper_world;

import java.util.Scanner;

public class Exception49 {
    public static void main(String[] args) {
        int n1, n2, result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two integers");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        try {
            result = n1 / n2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("exception caught:divison by zero");
        }
    }
}
