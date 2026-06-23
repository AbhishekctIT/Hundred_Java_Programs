package toper_world;

import java.util.Scanner;

public class WhileLoop19 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        while ((n = scanner.nextInt()) != 0) {
            System.out.println("you entered " + n);
            System.out.println("enter integer");
        }
        System.out.println("out of loop");
    }
}
