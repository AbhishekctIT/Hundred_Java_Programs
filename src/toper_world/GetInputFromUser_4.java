package toper_world;

import java.util.Scanner;

public class GetInputFromUser_4 {
    public static void main(String[] args) {
        int i;
        float f;
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string: ");
        s = scanner.next();
        System.out.println("you entered string: " + s);

        System.out.println("enter integer: ");
        i = scanner.nextInt();
        System.out.println("you entered integer: " + i);

        System.out.println("enter float: ");
        f = scanner.nextFloat();
        System.out.println("you entered float: " + f);
    }
}
